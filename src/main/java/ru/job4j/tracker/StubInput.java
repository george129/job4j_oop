package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answersPar) {
        answers = answersPar;
    }

    @Override
    public String askStr(String question) {
        return position + 1 <= answers.length ? answers[position++] : "";
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
