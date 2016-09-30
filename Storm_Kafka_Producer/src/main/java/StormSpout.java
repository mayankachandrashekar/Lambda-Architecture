import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import backtype.storm.utils.Utils;

import java.util.Map;

/**
 * Created by Mayanka on 16-Sep-15.
 */
public class StormSpout extends BaseRichSpout {
    SpoutOutputCollector _collector;
    int tweetid=0;

    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("Status"));
    }

    public void open(Map map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {
        _collector = spoutOutputCollector;

    }

    public void nextTuple() {
        Utils.sleep(1000);

       String s="HI How are you";

        _collector.emit(new Values(s));
    }
}
