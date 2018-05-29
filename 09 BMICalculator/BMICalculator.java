import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int feet, inches;
    double pounds, kg, m, bmi;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextInt();

    System.out.print("Your height (inches): ");
    inches = keyboard.nextInt();

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    //convert units to metric system
    kg = pounds * 0.45359237;
    m = (feet * 30.48 + inches * 2.54)*0.01;

    //calculate BMI
    bmi = kg/ (m*m);

    System.out.println("Your BMI is "+bmi);
  }
}
