import java.util.Scanner;

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
    private static int state = 0;

    public Question() {

    }

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public void printQuestion() {
        System.out.println(this.question);
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ") " + answers[i]);
        }
    }

    public void getAnswer() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        checkAnswer(choice);
    }

    public void checkAnswer(int choice) {
        if (choice == correctAnswer) {
            state++;
        }
    }

    public int getState() {
        return state;
    }
}
