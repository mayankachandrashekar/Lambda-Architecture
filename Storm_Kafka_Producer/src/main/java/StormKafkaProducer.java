import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.generated.StormTopology;
import backtype.storm.spout.SchemeAsMultiScheme;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import org.apache.log4j.BasicConfigurator;
import storm.kafka.KafkaSpout;
import storm.kafka.SpoutConfig;
import storm.kafka.StringScheme;
import storm.kafka.ZkHosts;
import storm.kafka.bolt.KafkaBolt;
import storm.kafka.bolt.mapper.FieldNameBasedTupleToKafkaMapper;
import storm.kafka.bolt.selector.DefaultTopicSelector;
import storm.kafka.trident.TridentKafkaState;
import storm.kafka.trident.TridentKafkaStateFactory;
import storm.kafka.trident.TridentKafkaUpdater;
import storm.trident.Stream;
import storm.trident.TridentTopology;
import storm.trident.testing.FixedBatchSpout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by user on 07/09/2016.
 */
public class StormKafkaProducer {
    static Logger log;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BasicConfigurator.configure();
      log = LoggerFactory.getLogger(StormKafkaProducer.class);

        if (args != null && args.length > 0) {
            try {
                StormSubmitter.submitTopology(
                        args[0],
                        createConfig(false),
                        createTopology());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            LocalCluster cluster = new LocalCluster();
            cluster.submitTopology(
                    "Kafka_Bolt_Test",
                    createConfig(true),
                    createTopology());
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            cluster.shutdown();
        }
    }

    private static StormTopology createTopology()
    {
        TopologyBuilder builder = new TopologyBuilder();

        /*Fields fields = new Fields("word", "count");
        FixedBatchSpout spout = new FixedBatchSpout(fields, 4,
                new Values("storm", "1"),
                new Values("trident", "1"),
                new Values("needs", "1"),
                new Values("javadoc", "1")
        );
        spout.setCycle(true);
        builder.setSpout("spout", spout, 5);
        */
        SpoutConfig kafkaConf = new SpoutConfig(
                new ZkHosts("localhost:2181"),
                "test",
                "/kafka",
                "KafkaSpout");
        kafkaConf.scheme = new SchemeAsMultiScheme(new StringScheme());
        log.info("Topology creation");
        builder.setSpout("KafkaSpout",new KafkaSpout(kafkaConf), 4);
        log.info("Twitter Spout Execution");
        builder.setBolt("SplitSentence", new SplitSentenceBolt(), 4).shuffleGrouping("KafkaSpout");
        log.info("Split sentence");
        builder.setBolt("WordCount",new WordCountBolt(),4).shuffleGrouping("SplitSentence");
        KafkaBolt bolt = new KafkaBolt().withTopicSelector(new DefaultTopicSelector("test1"))
                .withTupleToKafkaMapper(new FieldNameBasedTupleToKafkaMapper());
        builder.setBolt("forwardToKafka", bolt, 8).shuffleGrouping("WordCount");
        log.info("Kafka bolt");
        return builder.createTopology();
    }

    private static Config createConfig(boolean local)
    {
        Config conf = new Config();
        //set producer properties.
        Properties props = new Properties();
        props.put("metadata.broker.list", "localhost:9092");
        props.put("request.required.acks", "1");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        conf.put(TridentKafkaState.KAFKA_BROKER_PROPERTIES, props);
        return conf;
    }
}
