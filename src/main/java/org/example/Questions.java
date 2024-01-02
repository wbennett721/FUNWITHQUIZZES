package org.example;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public abstract class Questions {

    private final String question;
    private final HashMap<Integer, Choice> choiceHashMap = new HashMap<>();
    private int maxResponses = 1;

    //for questions with choice
    public Questions(String question, Choice[] choiceArray) {
        this.question = question;

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceHashMap() {
        return choiceHashMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choicesList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choicesList);
        for (int i=0; i < choicesList.size(); i++) {
            choiceMap.put(i+1, choicesList.get(i));

        }

    }
    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
         String newline = System.lineSeparator();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newline;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isInvalid(String resp) {
        try {
            int respInt = Integer.parseInt((resp));
            return respInt <= 0 || respInt > choiceMap.size();
        } catch (NumberFormatException o) {
            return true;
        }
    }
}
