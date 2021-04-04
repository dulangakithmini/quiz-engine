import java.util.List;

public class Paper {
    private List<Question> questionList;
    private int state;

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
