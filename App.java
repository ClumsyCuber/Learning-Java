import java.util.Scanner;

public class App() {
    public static void main(String [] args) {

        String q1 = "What color are apples?\n"
                + "(a)red\n(b)orange\n(c)magenta";
        String q2 = "What color are bananas?\n"
                + "(a)red\n(b)yellow\n(c)blue";

        Question [] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")
        };

    }
    public static void takeTest(Question [] questions) {
        int score = 0;
        for(int i = 0; i <questions.length; i++) {
            Scanner keyboardInput = new Scanner(System.in);
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);


    }

}
