import org.example.*;

public class QuizRunner {

    //Create Quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        //Create questions
        String q1 = "Which of the following colleges are in Missouri?";
        Choice[] q1Choices = new Choice[]{
                new Choice("Mizzou", true),
                new Choice("St.Louis University", true),
                new Choice("Harvard"),
                new Choice("TSU")

        };
        CheckBox question1 = new CheckBox(q1, q1Choices);

        String q2 = "The Mizzou mascot is a Tiger.";
        Choice[] q2Choices = new Choice[]{
                new Choice("True", true),
                new Choice("False"),
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Who is the current President of USA?";
        Choice[] q3Choices = new Choice[]{
                new Choice("Joe Biden", true),
                new Choice("Donald Trump"),
                new Choice("Barack Obama"),
                new Choice("Bill Clinton")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        // Add questions to the quiz
        quiz.addQuestions(new Questions[]{question1, question2, question3} );

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);
    }
}