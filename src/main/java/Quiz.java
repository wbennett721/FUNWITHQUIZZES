import org.example.Questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    public void run() {

        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for (Questions question : questions) {
            // Print question for user
            System.out.println(question);

            // Get and evaluate responses
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < questions.getMaxResponses()) {
                String userResponse;

                do {
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                } while (questions.isInvalid(userResponse));

                // Evaluate
                int userRespNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userRespNum)) {
                    System.out.println("You already got that one!");
                }else if (!questions.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice: question.getChoiceMap().values) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                }else {
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if (i == question.getMaxResponses() -1) {
                        numCorrect++;
                    }
                    i++;
                }
            }


            input.close();
        }
    }



}
