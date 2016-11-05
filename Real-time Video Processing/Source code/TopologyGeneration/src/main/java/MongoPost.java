import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by Naga on 03-11-2016.
 */
public class MongoPost {
    public static void main(String args[]) throws IOException {
        String API_KEY = "NV6PEwYt13rsIJu21LnqTqGtnC_pZv3X";
        String DATABASE_NAME = "kafkaconsumer";
        String COLLECTION_NAME = "model";
        String urlString = "https://api.mlab.com/api/1/databases/" +
                DATABASE_NAME + "/collections/" + COLLECTION_NAME + "?apiKey=" + API_KEY;

        StringBuilder result = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Accept", "application/json");
            Writer writer = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8"));
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", "  if (feature[40] <= 21.0) {\n" +
                    "   if (feature[52] <= -107.0) {\n" +
                    "    if (feature[56] <= -23.0) {\n" +
                    "     if (feature[28] <= -56.0) {\n" +
                    "      if (feature[77] <= -128.0) {\n" +
                    "       if (feature[98] <= -107.0) {\n" +
                    "        if (feature[119] <= -28.0) {\n" +
                    "         if (feature[1] <= -121.0) {\n" +
                    "          if (feature[89] <= -40.0) {\n" +
                    "           if (feature[25] <= -116.0) {\n" +
                    "            if (feature[9] <= -45.0) {\n" +
                    "             if (feature[51] <= -36.0) {\n" +
                    "              if (feature[64] <= -2.0) {\n" +
                    "               return 2.0;\n" +
                    "              }\n" +
                    "              else if (feature[64] > -2.0){\n" +
                    "               return 4.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[51] > -36.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[9] > -45.0){\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[25] > -116.0){\n" +
                    "            if (feature[23] <= -104.0) {\n" +
                    "             if (feature[4] <= -128.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[4] > -128.0){\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[23] > -104.0){\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[89] > -40.0){\n" +
                    "           return 4.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[1] > -121.0){\n" +
                    "          if (feature[35] <= -119.0) {\n" +
                    "           if (feature[38] <= -128.0) {\n" +
                    "            if (feature[65] <= -38.0) {\n" +
                    "             if (feature[99] <= -126.0) {\n" +
                    "              if (feature[12] <= -127.0) {\n" +
                    "               if (feature[19] <= -113.0) {\n" +
                    "                if (feature[97] <= -70.0) {\n" +
                    "                 if (feature[123] <= -35.0) {\n" +
                    "                  if (feature[41] <= 3.0) {\n" +
                    "                   return 2.0;\n" +
                    "                  }\n" +
                    "                  else if (feature[41] > 3.0){\n" +
                    "                   if (feature[0] <= -89.0) {\n" +
                    "                    return 2.0;\n" +
                    "                   }\n" +
                    "                   else if (feature[0] > -89.0){\n" +
                    "                    return 4.0;\n" +
                    "                   }\n" +
                    "                  }\n" +
                    "                 }\n" +
                    "                 else if (feature[123] > -35.0){\n" +
                    "                  return 4.0;\n" +
                    "                 }\n" +
                    "                }\n" +
                    "                else if (feature[97] > -70.0){\n" +
                    "                 return 4.0;\n" +
                    "                }\n" +
                    "               }\n" +
                    "               else if (feature[19] > -113.0){\n" +
                    "                if (feature[2] <= -91.0) {\n" +
                    "                 return 4.0;\n" +
                    "                }\n" +
                    "                else if (feature[2] > -91.0){\n" +
                    "                 return 2.0;\n" +
                    "                }\n" +
                    "               }\n" +
                    "              }\n" +
                    "              else if (feature[12] > -127.0){\n" +
                    "               return 4.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[99] > -126.0){\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[65] > -38.0){\n" +
                    "             if (feature[64] <= -14.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[64] > -14.0){\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[38] > -128.0){\n" +
                    "            if (feature[60] <= -128.0) {\n" +
                    "             if (feature[2] <= -91.0) {\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "             else if (feature[2] > -91.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[60] > -128.0){\n" +
                    "             if (feature[14] <= -127.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[14] > -127.0){\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[35] > -119.0){\n" +
                    "           if (feature[51] <= -123.0) {\n" +
                    "            if (feature[119] <= -104.0) {\n" +
                    "             if (feature[35] <= -66.0) {\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "             else if (feature[35] > -66.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[119] > -104.0){\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[51] > -123.0){\n" +
                    "            if (feature[14] <= -128.0) {\n" +
                    "             if (feature[19] <= -47.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[19] > -47.0){\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[14] > -128.0){\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[119] > -28.0){\n" +
                    "         if (feature[14] <= -128.0) {\n" +
                    "          if (feature[57] <= -107.0) {\n" +
                    "           return 1.0;\n" +
                    "          }\n" +
                    "          else if (feature[57] > -107.0){\n" +
                    "           if (feature[0] <= -128.0) {\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "           else if (feature[0] > -128.0){\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[14] > -128.0){\n" +
                    "          return 4.0;\n" +
                    "         }\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[98] > -107.0){\n" +
                    "        if (feature[91] <= -128.0) {\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "        else if (feature[91] > -128.0){\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[77] > -128.0){\n" +
                    "       if (feature[117] <= -111.0) {\n" +
                    "        if (feature[22] <= -124.0) {\n" +
                    "         if (feature[51] <= -128.0) {\n" +
                    "          if (feature[107] <= -115.0) {\n" +
                    "           if (feature[66] <= -107.0) {\n" +
                    "            if (feature[19] <= -123.0) {\n" +
                    "             if (feature[63] <= -92.0) {\n" +
                    "              if (feature[78] <= -14.0) {\n" +
                    "               if (feature[76] <= -18.0) {\n" +
                    "                if (feature[55] <= -23.0) {\n" +
                    "                 if (feature[14] <= -75.0) {\n" +
                    "                  if (feature[24] <= -9.0) {\n" +
                    "                   if (feature[35] <= -39.0) {\n" +
                    "                    return 1.0;\n" +
                    "                   }\n" +
                    "                   else if (feature[35] > -39.0){\n" +
                    "                    if (feature[0] <= -126.0) {\n" +
                    "                     return 1.0;\n" +
                    "                    }\n" +
                    "                    else if (feature[0] > -126.0){\n" +
                    "                     return 4.0;\n" +
                    "                    }\n" +
                    "                   }\n" +
                    "                  }\n" +
                    "                  else if (feature[24] > -9.0){\n" +
                    "                   return 4.0;\n" +
                    "                  }\n" +
                    "                 }\n" +
                    "                 else if (feature[14] > -75.0){\n" +
                    "                  return 4.0;\n" +
                    "                 }\n" +
                    "                }\n" +
                    "                else if (feature[55] > -23.0){\n" +
                    "                 return 4.0;\n" +
                    "                }\n" +
                    "               }\n" +
                    "               else if (feature[76] > -18.0){\n" +
                    "                return 2.0;\n" +
                    "               }\n" +
                    "              }\n" +
                    "              else if (feature[78] > -14.0){\n" +
                    "               return 2.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[63] > -92.0){\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[19] > -123.0){\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[66] > -107.0){\n" +
                    "            if (feature[0] <= -124.0) {\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "            else if (feature[0] > -124.0){\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[107] > -115.0){\n" +
                    "           if (feature[0] <= -66.0) {\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "           else if (feature[0] > -66.0){\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[51] > -128.0){\n" +
                    "          if (feature[49] <= -26.0) {\n" +
                    "           if (feature[49] <= -92.0) {\n" +
                    "            if (feature[17] <= -116.0) {\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "            else if (feature[17] > -116.0){\n" +
                    "             return 4.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[49] > -92.0){\n" +
                    "            if (feature[33] <= -123.0) {\n" +
                    "             if (feature[56] <= -92.0) {\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "             else if (feature[56] > -92.0){\n" +
                    "              if (feature[8] <= -111.0) {\n" +
                    "               return 1.0;\n" +
                    "              }\n" +
                    "              else if (feature[8] > -111.0){\n" +
                    "               return 4.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[33] > -123.0){\n" +
                    "             if (feature[80] <= -7.0) {\n" +
                    "              if (feature[3] <= -125.0) {\n" +
                    "               return 2.0;\n" +
                    "              }\n" +
                    "              else if (feature[3] > -125.0){\n" +
                    "               return 1.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[80] > -7.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[49] > -26.0){\n" +
                    "           return 1.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[22] > -124.0){\n" +
                    "         if (feature[81] <= -110.0) {\n" +
                    "          if (feature[93] <= -114.0) {\n" +
                    "           if (feature[16] <= -68.0) {\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "           else if (feature[16] > -68.0){\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[93] > -114.0){\n" +
                    "           if (feature[21] <= -114.0) {\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "           else if (feature[21] > -114.0){\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[81] > -110.0){\n" +
                    "          if (feature[93] <= -48.0) {\n" +
                    "           if (feature[23] <= -128.0) {\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "           else if (feature[23] > -128.0){\n" +
                    "            if (feature[83] <= -31.0) {\n" +
                    "             if (feature[88] <= -27.0) {\n" +
                    "              if (feature[80] <= 22.0) {\n" +
                    "               if (feature[47] <= -1.0) {\n" +
                    "                if (feature[53] <= -70.0) {\n" +
                    "                 if (feature[2] <= -81.0) {\n" +
                    "                  if (feature[109] <= -74.0) {\n" +
                    "                   return 2.0;\n" +
                    "                  }\n" +
                    "                  else if (feature[109] > -74.0){\n" +
                    "                   if (feature[0] <= -128.0) {\n" +
                    "                    return 4.0;\n" +
                    "                   }\n" +
                    "                   else if (feature[0] > -128.0){\n" +
                    "                    return 2.0;\n" +
                    "                   }\n" +
                    "                  }\n" +
                    "                 }\n" +
                    "                 else if (feature[2] > -81.0){\n" +
                    "                  if (feature[10] <= -92.0) {\n" +
                    "                   return 2.0;\n" +
                    "                  }\n" +
                    "                  else if (feature[10] > -92.0){\n" +
                    "                   return 4.0;\n" +
                    "                  }\n" +
                    "                 }\n" +
                    "                }\n" +
                    "                else if (feature[53] > -70.0){\n" +
                    "                 return 4.0;\n" +
                    "                }\n" +
                    "               }\n" +
                    "               else if (feature[47] > -1.0){\n" +
                    "                return 4.0;\n" +
                    "               }\n" +
                    "              }\n" +
                    "              else if (feature[80] > 22.0){\n" +
                    "               if (feature[3] <= -124.0) {\n" +
                    "                return 1.0;\n" +
                    "               }\n" +
                    "               else if (feature[3] > -124.0){\n" +
                    "                return 4.0;\n" +
                    "               }\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[88] > -27.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[83] > -31.0){\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[93] > -48.0){\n" +
                    "           if (feature[0] <= -125.0) {\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "           else if (feature[0] > -125.0){\n" +
                    "            if (feature[0] <= -119.0) {\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "            else if (feature[0] > -119.0){\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[117] > -111.0){\n" +
                    "        if (feature[89] <= -40.0) {\n" +
                    "         if (feature[48] <= 17.0) {\n" +
                    "          if (feature[11] <= -86.0) {\n" +
                    "           if (feature[12] <= -92.0) {\n" +
                    "            if (feature[106] <= -123.0) {\n" +
                    "             if (feature[52] <= -110.0) {\n" +
                    "              if (feature[94] <= -34.0) {\n" +
                    "               return 1.0;\n" +
                    "              }\n" +
                    "              else if (feature[94] > -34.0){\n" +
                    "               if (feature[0] <= -125.0) {\n" +
                    "                return 4.0;\n" +
                    "               }\n" +
                    "               else if (feature[0] > -125.0){\n" +
                    "                return 1.0;\n" +
                    "               }\n" +
                    "              }\n" +
                    "             }\n" +
                    "             else if (feature[52] > -110.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[106] > -123.0){\n" +
                    "             if (feature[1] <= -128.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[1] > -128.0){\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[12] > -92.0){\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[11] > -86.0){\n" +
                    "           if (feature[8] <= -99.0) {\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "           else if (feature[8] > -99.0){\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[48] > 17.0){\n" +
                    "          return 2.0;\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[89] > -40.0){\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[28] > -56.0){\n" +
                    "      if (feature[18] <= -118.0) {\n" +
                    "       if (feature[123] <= 3.0) {\n" +
                    "        if (feature[16] <= 29.0) {\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "        else if (feature[16] > 29.0){\n" +
                    "         return 2.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[123] > 3.0){\n" +
                    "        if (feature[3] <= -128.0) {\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "        else if (feature[3] > -128.0){\n" +
                    "         return 2.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[18] > -118.0){\n" +
                    "       if (feature[103] <= -123.0) {\n" +
                    "        if (feature[16] <= -9.0) {\n" +
                    "         return 2.0;\n" +
                    "        }\n" +
                    "        else if (feature[16] > -9.0){\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[103] > -123.0){\n" +
                    "        if (feature[1] <= -113.0) {\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "        else if (feature[1] > -113.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "    else if (feature[56] > -23.0){\n" +
                    "     if (feature[79] <= -46.0) {\n" +
                    "      if (feature[123] <= -35.0) {\n" +
                    "       if (feature[88] <= -99.0) {\n" +
                    "        return 2.0;\n" +
                    "       }\n" +
                    "       else if (feature[88] > -99.0){\n" +
                    "        if (feature[16] <= 53.0) {\n" +
                    "         if (feature[103] <= -41.0) {\n" +
                    "          return 4.0;\n" +
                    "         }\n" +
                    "         else if (feature[103] > -41.0){\n" +
                    "          return 1.0;\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[16] > 53.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[123] > -35.0){\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[79] > -46.0){\n" +
                    "      return 2.0;\n" +
                    "     }\n" +
                    "    }\n" +
                    "   }\n" +
                    "   else if (feature[52] > -107.0){\n" +
                    "    if (feature[123] <= -79.0) {\n" +
                    "     if (feature[114] <= -65.0) {\n" +
                    "      if (feature[105] <= -31.0) {\n" +
                    "       if (feature[108] <= -78.0) {\n" +
                    "        if (feature[72] <= 22.0) {\n" +
                    "         if (feature[21] <= -25.0) {\n" +
                    "          if (feature[104] <= 13.0) {\n" +
                    "           if (feature[84] <= -128.0) {\n" +
                    "            if (feature[0] <= -128.0) {\n" +
                    "             return 4.0;\n" +
                    "            }\n" +
                    "            else if (feature[0] > -128.0){\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[84] > -128.0){\n" +
                    "            if (feature[67] <= -22.0) {\n" +
                    "             if (feature[3] <= -20.0) {\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "             else if (feature[3] > -20.0){\n" +
                    "              if (feature[0] <= -126.0) {\n" +
                    "               return 4.0;\n" +
                    "              }\n" +
                    "              else if (feature[0] > -126.0){\n" +
                    "               return 2.0;\n" +
                    "              }\n" +
                    "             }\n" +
                    "            }\n" +
                    "            else if (feature[67] > -22.0){\n" +
                    "             if (feature[3] <= -85.0) {\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "             else if (feature[3] > -85.0){\n" +
                    "              return 4.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[104] > 13.0){\n" +
                    "           return 2.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[21] > -25.0){\n" +
                    "          if (feature[3] <= -128.0) {\n" +
                    "           if (feature[6] <= -114.0) {\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "           else if (feature[6] > -114.0){\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[3] > -128.0){\n" +
                    "           return 4.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[72] > 22.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[108] > -78.0){\n" +
                    "        if (feature[9] <= -103.0) {\n" +
                    "         if (feature[16] <= -92.0) {\n" +
                    "          return 4.0;\n" +
                    "         }\n" +
                    "         else if (feature[16] > -92.0){\n" +
                    "          return 2.0;\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[9] > -103.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[105] > -31.0){\n" +
                    "       if (feature[7] <= -60.0) {\n" +
                    "        if (feature[80] <= -31.0) {\n" +
                    "         return 2.0;\n" +
                    "        }\n" +
                    "        else if (feature[80] > -31.0){\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[7] > -60.0){\n" +
                    "        return 1.0;\n" +
                    "       }\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[114] > -65.0){\n" +
                    "      if (feature[1] <= -118.0) {\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "      else if (feature[1] > -118.0){\n" +
                    "       if (feature[57] <= -121.0) {\n" +
                    "        return 2.0;\n" +
                    "       }\n" +
                    "       else if (feature[57] > -121.0){\n" +
                    "        if (feature[3] <= -85.0) {\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "        else if (feature[3] > -85.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "    else if (feature[123] > -79.0){\n" +
                    "     if (feature[39] <= -128.0) {\n" +
                    "      if (feature[0] <= -128.0) {\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "      else if (feature[0] > -128.0){\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[39] > -128.0){\n" +
                    "      if (feature[31] <= -112.0) {\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "      else if (feature[31] > -112.0){\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "   }\n" +
                    "  }\n" +
                    "  else if (feature[40] > 21.0){\n" +
                    "   if (feature[30] <= -128.0) {\n" +
                    "    if (feature[27] <= -123.0) {\n" +
                    "     if (feature[88] <= -102.0) {\n" +
                    "      if (feature[70] <= -62.0) {\n" +
                    "       if (feature[126] <= -122.0) {\n" +
                    "        if (feature[17] <= -126.0) {\n" +
                    "         if (feature[9] <= -127.0) {\n" +
                    "          return 1.0;\n" +
                    "         }\n" +
                    "         else if (feature[9] > -127.0){\n" +
                    "          return 2.0;\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[17] > -126.0){\n" +
                    "         if (feature[90] <= -120.0) {\n" +
                    "          if (feature[48] <= 34.0) {\n" +
                    "           if (feature[61] <= -105.0) {\n" +
                    "            if (feature[119] <= -99.0) {\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "            else if (feature[119] > -99.0){\n" +
                    "             if (feature[1] <= -120.0) {\n" +
                    "              return 1.0;\n" +
                    "             }\n" +
                    "             else if (feature[1] > -120.0){\n" +
                    "              return 2.0;\n" +
                    "             }\n" +
                    "            }\n" +
                    "           }\n" +
                    "           else if (feature[61] > -105.0){\n" +
                    "            if (feature[0] <= -94.0) {\n" +
                    "             return 2.0;\n" +
                    "            }\n" +
                    "            else if (feature[0] > -94.0){\n" +
                    "             return 1.0;\n" +
                    "            }\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[48] > 34.0){\n" +
                    "           return 2.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[90] > -120.0){\n" +
                    "          if (feature[32] <= -84.0) {\n" +
                    "           if (feature[0] <= -125.0) {\n" +
                    "            return 4.0;\n" +
                    "           }\n" +
                    "           else if (feature[0] > -125.0){\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "          else if (feature[32] > -84.0){\n" +
                    "           return 2.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[126] > -122.0){\n" +
                    "        if (feature[2] <= -109.0) {\n" +
                    "         return 2.0;\n" +
                    "        }\n" +
                    "        else if (feature[2] > -109.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[70] > -62.0){\n" +
                    "       if (feature[1] <= -120.0) {\n" +
                    "        return 2.0;\n" +
                    "       }\n" +
                    "       else if (feature[1] > -120.0){\n" +
                    "        return 4.0;\n" +
                    "       }\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[88] > -102.0){\n" +
                    "      if (feature[119] <= -53.0) {\n" +
                    "       if (feature[47] <= -88.0) {\n" +
                    "        return 2.0;\n" +
                    "       }\n" +
                    "       else if (feature[47] > -88.0){\n" +
                    "        if (feature[0] <= -89.0) {\n" +
                    "         return 4.0;\n" +
                    "        }\n" +
                    "        else if (feature[0] > -89.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[119] > -53.0){\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "    else if (feature[27] > -123.0){\n" +
                    "     if (feature[114] <= -126.0) {\n" +
                    "      if (feature[59] <= -75.0) {\n" +
                    "       return 2.0;\n" +
                    "      }\n" +
                    "      else if (feature[59] > -75.0){\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[114] > -126.0){\n" +
                    "      if (feature[2] <= -120.0) {\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "      else if (feature[2] > -120.0){\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "   }\n" +
                    "   else if (feature[30] > -128.0){\n" +
                    "    if (feature[88] <= -59.0) {\n" +
                    "     if (feature[44] <= -114.0) {\n" +
                    "      if (feature[127] <= -50.0) {\n" +
                    "       if (feature[91] <= -40.0) {\n" +
                    "        if (feature[75] <= -116.0) {\n" +
                    "         if (feature[101] <= -56.0) {\n" +
                    "          if (feature[41] <= -27.0) {\n" +
                    "           return 2.0;\n" +
                    "          }\n" +
                    "          else if (feature[41] > -27.0){\n" +
                    "           if (feature[0] <= -78.0) {\n" +
                    "            return 2.0;\n" +
                    "           }\n" +
                    "           else if (feature[0] > -78.0){\n" +
                    "            return 1.0;\n" +
                    "           }\n" +
                    "          }\n" +
                    "         }\n" +
                    "         else if (feature[101] > -56.0){\n" +
                    "          if (feature[0] <= -94.0) {\n" +
                    "           return 1.0;\n" +
                    "          }\n" +
                    "          else if (feature[0] > -94.0){\n" +
                    "           return 2.0;\n" +
                    "          }\n" +
                    "         }\n" +
                    "        }\n" +
                    "        else if (feature[75] > -116.0){\n" +
                    "         return 1.0;\n" +
                    "        }\n" +
                    "       }\n" +
                    "       else if (feature[91] > -40.0){\n" +
                    "        return 4.0;\n" +
                    "       }\n" +
                    "      }\n" +
                    "      else if (feature[127] > -50.0){\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[44] > -114.0){\n" +
                    "      if (feature[12] <= -103.0) {\n" +
                    "       return 1.0;\n" +
                    "      }\n" +
                    "      else if (feature[12] > -103.0){\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "    }\n" +
                    "    else if (feature[88] > -59.0){\n" +
                    "     if (feature[64] <= -99.0) {\n" +
                    "      if (feature[8] <= -27.0) {\n" +
                    "       return 4.0;\n" +
                    "      }\n" +
                    "      else if (feature[8] > -27.0){\n" +
                    "       return 2.0;\n" +
                    "      }\n" +
                    "     }\n" +
                    "     else if (feature[64] > -99.0){\n" +
                    "      return 1.0;\n" +
                    "     }\n" +
                    "    }\n" +
                    "   }\n" +
                    "  }\n");
            writer.write(jsonObject.toString());
            writer.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //print result
//            System.out.println(response.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}