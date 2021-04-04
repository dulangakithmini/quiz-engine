import java.util.List;

public class Paper {
    private List<Question> questionList;

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
        Question q = questionList.get(index - 1);
        q.printQuestion();
    }
}