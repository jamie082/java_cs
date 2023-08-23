import java.util.Scanner;

/* Menu driven program. Enter 1 for convert inch to meters. Enter 2 to convert gallons to liters. Loop if one or 2 wasnt successful */

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  //boolean set_statement = false;
    // start program
    // where is the while(!set_statement) {
    double gallons;
    double liters;

   // liters = gallons * 3.7854; // convert to liters

    /*

    System.out.println("Welcome to my Conversion Program by Jamie v.01")
    System.out.println("Please select 1 for inch conversion or 2 for gallon conversion")
    while (true) {
      switch (my_input) {
        case 1: inputString = "1.) Input a value for inch: ";
          break;
        case 2: inputString = "2.) Input a value for gallon: ";
          break;
        }
      }
    */
    try {
      System.out.print("Input a value for inch: ");
      double inch = input.nextDouble();
      double meters = inch * 0.0254;
      System.out.println(inch + " inch is " + meters + " meters");
      System.out.println(gallons + " gallons is " + liters + " liters.");
  } catch(Exception e) {
      System.out.println("Not a valid number.");
      // Clear out input buffer
      //input.NextLine();
    }
  }
}