import org.example.Choice;

public class QuizRunner {

    //Create Quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        //Create questions
        String q1 = "Which of the following colleges are in Missouri?";
        Choice[] q1Choices = new Choices[] {
                new Choice( "Mizzou", true)
                new Choice("St.Louis University", true),
                new Choice("Harvard"),
                new Choice("TSU")

        };
    }
}
