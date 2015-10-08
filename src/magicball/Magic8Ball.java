package magicball;
import java.util.Random;

public class Magic8Ball {
  
  private Random r = new Random();
  
  public Magic8Ball() {}

  public String generateAnswer() {
    int choice = 1 + r.nextInt(15);
    if (choice == 1)
      return "It is certain";
    else if (choice == 2)
      return "It is decidedly so";
    else if (choice == 3)
      return "Without a doubt";
    else if (choice == 4)
      return "Yes - definitely";
    else if (choice == 5)
      return "You may rely on it";
    else if (choice == 6)
      return "As I see it, yes";
    else if (choice == 7)
      return "Most likely";
    else if (choice == 8)
      return "Outlook good";
    else if (choice == 9)
      return "Signs point to yes";
    else if (choice == 10)
      return "Yes";
    else if (choice == 11)
      return "Reply hazy, try again";
    else if (choice == 12)
      return "Ask again later";
    else if (choice == 13)
      return "Better not tell you now";
    else if (choice == 14)
      return "Cannot predict now";
    else if (choice == 15)
      return "Concentrate and ask again";
    else if (choice == 16)
      return "Don't count on it";
    else if (choice == 17)
      return "My reply is no";
    else if (choice == 18)
      return "My sources say no";
    else if (choice == 19)
      return "Outlook not so good";
    else if (choice == 20)
      return "Very doubtful";
    else
      return "8-BALL ERROR!";
  }
  
}