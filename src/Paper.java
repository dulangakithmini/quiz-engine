import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.List;

public class Paper {
    private List<Question> questionList;
    private int state;

    public static void fromJSON() {
        JSONObject paperMap = Utils.readJSONFromPath("D://questions.json");

        JSONArray questionsArray = (JSONArray) paperMap.get("questions");

        Iterator i = questionsArray.iterator();
        while (i.hasNext()) {
            JSONObject slide = (JSONObject) i.next();
            String questionString = (String) slide.get("question");
            System.out.println(questionString);
            JSONArray answersString = (JSONArray) slide.get("answers");
//            for (int j=0; j<answersString.size(); j++) {
//                System.out.println((j+1) + ") " +answersString.get(j));
//            }
            System.out.println(answersString);
            long correctAnswer = (long) slide.get("correctAnswer");
            int correctAnswerValue = Math.toIntExact(correctAnswer);
            System.out.println(correctAnswerValue);

        }
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public int getQuestionCount() {
        return questionList.size();
    }

    public void getQuestion(int index) {
        Question question = questionList.get(index);
        question.printQuestion();
        int choice = question.getAnswer();

        if (question.checkAnswer(choice)) {
            this.state++;
        }
    }

    public int getState() {
        return state;
    }
}