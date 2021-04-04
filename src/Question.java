import java.util.Scanner;

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

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

    public int getAnswer() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public boolean checkAnswer(int choice) {
        return choice == correctAnswer;
    }
}