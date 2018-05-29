public class CreatingVariables{
  public static void main(String[] args){
    int x, y, age, birthdate;
    double seconds, e, checking, length;
    String firstName, lastName, title , birthday, birthmonth;

    x = 10;
    y = 400;
    age = 27;
    birthdate=13;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    length = 1.91;

    firstName = "John";
    lastName = "Kanon";
    title = "Mr.";
    birthday = "Monday";
    birthmonth = "August";

    System.out.println("The variable x contains " + x );
    System.out.println("The value " + y + " is stored in the variable y." );
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e );
    System.out.println("Hopefully you have more than $" + checking + "!" );
    System.out.println("My name's " + title + " " + firstName + " " + lastName +".");
    System.out.println("I am "+ length + " meters tall.");
    System.out.println("I was born on "+birthday+ " " + birthmonth + " " + birthdate +"th.");
  }
}
