import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public abstract class Utils {
    public static JSONObject readJSONFromPath(String path) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(path));

            JSONObject paperMap = (JSONObject) obj;
            return paperMap;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}