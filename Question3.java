import java.util.Scanner;

public class Question3
{
  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in); 
    //System.out.println("Enter an inetger:");
    int num = userIn.nextInt();
    int numSq = (num * num);
    System.out.println(numSq);
  }
}
