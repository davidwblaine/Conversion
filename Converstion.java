// Assignment 1 Length Conversion Program
// David Blaine 
// COSC 237 004
// Fall 2020
import java.util.Scanner;
public class Converstion {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
   // Declarations of main
   int ans;
   char restart;

   //Main body
   do{
    DisplayPromptStatement();
      ans = input.nextInt();
    if(ans == 1){
      Metric_Imperial();
}
    else{
      Imperial_Metric();
  }
  //Restart Prompt 
  System.out.println("Would you like to do another conversion: (Y/N)");
    restart = input.next().charAt(0);} 
  while(restart == 'Y' || restart == 'y' ); 
  System.out.print("No more conversions will be made");
 }
  //Function will display the opening Prompt Statement
  public static void DisplayPromptStatement() {
    System.out.println("What would you like to do?");
    System.out.println("Press 1 for Metric to Imperial conversion");
    System.out.println("Press 2 for Imperial to Metric conversion");
  }
  //Function that converts Metric into Imperial
  public static void Metric_Imperial(){
    double ft, in, m, cm, cm_per_in = 2.54, convertedIn, total_cm;
    
    System.out.println("Please enter meters and then enter centimeters: ");
      m = input.nextDouble();
      cm = input.nextDouble();
        
      //Conversion Math
      total_cm = (m * 100) + cm;
      convertedIn = (m * 100 + cm) / cm_per_in;
      ft = (int)convertedIn / 12;
      in = convertedIn - ft * 12;

    System.out.print("You entered " + (int)m + " meters and ");
    System.out.printf("%.2f centimeters \n", cm);
    System.out.print("Converted to imperial is " + (int)ft + " feet and ");
    System.out.printf("%.2f inches \n", in);
  }
  //Function that converts Imperial into Metric
  public static void Imperial_Metric(){
    double ft, in, m, cm, total_in, cm_per_in = 2.54, convertedCm;

    System.out.println("Please enter feet and then enter inches: ");
      ft = input.nextDouble();
      in = input.nextDouble();

      //Conversion Math
      total_in = in + ft * 12;
      convertedCm = total_in * cm_per_in;
      m = (int)convertedCm / 100;
      cm = convertedCm - m * 100;

    System.out.print("You entered " + (int)ft + " feet and ");
    System.out.printf("%.2f inches \n", in);
    System.out.print("Converted to metric is " + (int)m + " meters and ");
    System.out.printf("%.2f centimeters \n", cm);
  }
}
