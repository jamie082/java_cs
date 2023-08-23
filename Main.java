import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  //boolean set_statement = false;
    // start program
    // where is the while(!set_statement) {
    try {
      System.out.print("Input a value for inch: ");
      double inch = input.nextDouble();
      double meters = inch * 0.0254;
      System.out.println(inch + " inch is " + meters + " meters");
  } catch(Exception e) {
      System.out.println("Not a valid number.");
      // Clear out input buffer
      //input.NextLine();
    }
  }
}