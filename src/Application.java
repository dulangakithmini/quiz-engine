import java.util.ArrayList;
import java.util.List;

public class Application {

    public void run() {
        JsonReadFromTheFile jsonReadFromTheFile = new JsonReadFromTheFile();
        jsonReadFromTheFile.readJson();

        Question question1 = new Question("Who is the most innocent?", new String[]{"Nipuna", "Phi Ball", "Dulanga", "Pue"}, 3);
        Question question2 = new Question("Who is the fluffiest?", new String[]{"Nipuna", "Phi Ball", "Pue", "All the above"}, 4);
        Question question3 = new Question("What is Phi's fur colour?", new String[]{"Black", "Blue", "Brown", "Pink"}, 4);
        Question question4 = new Question("What's the most precious thing about Phi?", new String[]{"Sexy brain", "Fur coat", "Long legs", "Broad Chest"}, 2);


        List<Question> questionList = new ArrayList<>();
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        Paper paper = new Paper();
        paper.setQuestionList(questionList);
        paper.addQuestion(question4);

        for (int i = 0; i < questionList.size(); i++) {
            paper.getQuestion(i);
        }

        System.out.println("Score = " + (paper.getState() + "/" + paper.getQuestionCount()));
    }
}