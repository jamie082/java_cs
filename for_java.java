import java.util.Scanner;

/* Menu driven program. Enter 1 for convert inch to meters. Enter 2 to convert gallons to liters. Loop if one or 2 wasnt successful */

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  //boolean set_statement = false;
    // start program
    // where is the while(!set_statement) {
   // liters = gallons * 3.7854; // convert to liters
    System.out.println("Welcome to my Conversion Program by Jamie M WGU Computer Science Student v.01");
    System.out.println("Please select 1 for inch conversion or 2 for gallon conversion : ");
    int UserIn;
    UserIn = in.nextInt(); /* Get user input for program into */
    
    String inputString = "";

    int my_input = inputString;
    
    switch (my_input) { // inputted value from choice
        case 1: inputString = "1.) Input a value for inch: ";
          double meters = inch * 0.0254;
          double inch = input.nextDouble();
          System.out.println(inch + " inch is " +  meters + " meters");
          break;
        case 2: inputString = "2.) Input a value for gallon: ";
          double gallons;
          double liters;
          gallons = 10;
          liters = gallons * 3.7854;
          System.out.println(gallons + " gallons is " + liters + " liters");
        default:
    }
  }
}