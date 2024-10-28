import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
  public static void main(String[] args) {
    // Rock = 0;
    // Paper = 1;
    // Scissor = 2;
    System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
    Scanner sc = new Scanner(System.in);
    int user = sc.nextInt();

    Random r = new Random();
    int comp = r.nextInt(3);
    if (user == comp) {
      System.out.println("Draw");
    } 
    else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
      System.out.println("You Won the Match");
    } else {
      System.out.println("Sorry!! Computer Won the Match. Try Again");
    }

    if (comp == 0) {
      System.out.println("Computer chose Rock");
    } else if (comp == 1) {
      System.out.println("Computer chose Paper");
    } else if (comp == 2) {
      System.out.println("Computer chose Scissor");
    }
  }
}
