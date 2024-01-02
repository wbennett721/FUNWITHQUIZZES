import org.example.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    private final ArrayList<Questions> questions = new ArrayList<>();

    private int numCorrect = 0;

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Questions[] questionsArray) {
        Collections.addAll(questions, questionsArray);
    }


}
