import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args){
    String name;
    int age;
    double weight, income, length;

    Scanner keyboard =  new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + ". How old are you? ");
    age = keyboard.nextInt();
    //The program blows up when entering a string or a number with a fractional part

    System.out.println("So you're "+age+", eh? That's not very old.");
    System.out.print("How much do you weigh, "+name+"? ");
    weight = keyboard.nextDouble();
    //The program blows up when entering a string value

    System.out.println(weight+"! Better keep that quiet!!");
    System.out.print("What is your income, "+name+"? ");
    income = keyboard.nextDouble();
    //The program blows up when entering a string value

    System.out.print("Hopefully that is "+income+" per hour");
    System.out.println(" and not per year!");

    System.out.print("Finally, how tall are you, "+name+"? ");
    length = keyboard.nextDouble();
    System.out.println(length+"! That's small!");

    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name+".");
  }
}
// Study drill 1: Integer values are allowed when the program expects a double value. I suspect this is because the whole number 1 can be interpreted as 1.0.
// Study drill 2: Integer values are allowed when the program expects a string value. I suspect this is because numbers can also be part of a text.
