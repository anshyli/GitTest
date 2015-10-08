package magicball;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicBallApp {
  public static void main(String[] args) {
    ArrayList questions = new ArrayList();
    ArrayList answers = new ArrayList();
    Scanner s = new Scanner(System.in);
    Magic8Ball ball = new Magic8Ball();
    char cont = 'Y';
    
    while (cont == 'Y') {
      System.out.print("Ask me a question... ");
      String question = s.nextLine();
      if (question.equals("history")) {
        for (int i = 0; i < questions.size(); i++) {
          System.out.println("Q: " + questions.get(i));
          System.out.println("A: " + answers.get(i) + "\n");
        }
        continue;
      }
      questions.add(question);  

      String response = ball.generateAnswer();
      answers.add(response);
      System.out.println("MAGIC 8-BALL SAYS: " + response);
      
      System.out.print("\nWould you like to ask another question? ");
      cont = s.nextLine().toUpperCase().charAt(0);
    }
    System.out.println("Goodbye");
    s.close();
  }
}