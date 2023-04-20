import java.util.Scanner;

public class Question4
{
  class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int y = 0;
        y < num;
        y++) {
      for(int x = num-y;
        x > 0;
        x--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
