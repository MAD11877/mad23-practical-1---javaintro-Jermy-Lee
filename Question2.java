import java.util.Scanner;

public class Question2
{
  public static void main(String[] args) {
    /*Scanner userIn = new Scanner(System.in); 
    System.out.println("Enter your height:");
    double height = userIn.nextDouble();
    System.out.println("Enter your weight:");
    double weight = userIn.nextDouble();*/
    double BMI = weight / (height * height);
    System.out.println(BMI);
  }
}
