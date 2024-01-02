package org.example;

public class TrueOrFalse extends Questions {
    public TrueOrFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "TRUE OR FALSE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

}

