import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Question question = new Question("Who is the most innocent?", new String[]{"Nipuna", "Phi Ball", "Dulanga", "Pue"}, 3);
        question.printQuestion();
        question.getAnswer();

        Question question1 = new Question("Who is the fluffiest?", new String[]{"Nipuna", "Phi Ball", "Pue", "All the above"}, 4);
        question1.printQuestion();
        question1.getAnswer();

        List<Question> questionList = new ArrayList<>();
        questionList.add(question);
        questionList.add(question1);

        Paper paper = new Paper();
        paper.setQuestionList(questionList);

        Question question3 = new Question("What is Phi's fur colour?", new String[]{"Black", "Blue", "Brown", "Pink"}, 4);
        paper.addQuestion(question3);

        System.out.println("Question count = " + paper.getQuestionCount());

        System.out.print("3) ");
        paper.getQuestion(3);
    }
}