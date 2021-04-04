import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class JsonReadFromTheFile {
    public void readJson() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("D://questions.json"));
            JSONArray questions = (JSONArray) obj;

            questions.forEach(question -> parseQuestion((JSONObject) question));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private void parseQuestion(JSONObject jsonObject) {
//        JSONObject jsonObject1 = (JSONObject) jsonObject.get("questions");
        String question = (String) jsonObject.get("question");
        String correctAnswer = (String) jsonObject.get("correctAnswer");
        JSONArray answers = (JSONArray) jsonObject.get("answers");

        System.out.println(question);

        Iterator iterator = answers.iterator();
        while (iterator.hasNext()) {
            for (int i = 0; i < answers.size(); i++) {
                System.out.print((i + 1) + ") ");
                System.out.println(iterator.next());

            }
        }

    }
}
