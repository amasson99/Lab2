import java.util.*;

public class Lab2 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);// Declare a Scanner object here to be used for input

    double creditHours1;
    String letterGrade1;
    int total;


    /*double creditHours2;
    double creditHours3;
    double creditHours4;*/

    String input;

    System.out.print("Please enter credit hours for the course(1): ");
			input = in.nextLine();
      creditHours1 = Double.parseDouble(input);

    System.out.print("Please enter the letter grade recieved for the course(1): ");
  		letterGrade1 = in.nextLine();

      if (letterGrade1.equals("A") || letterGrade1.equals("a")){
        dec = 4;
        total += dec;

    } else if (letterGrade1.equals("B") || letterGrade1.equals("b")){
        dec = 3;
        total += dec;

    } else if (letterGrade1.equals("C") || letterGrade1.equals("c")){
        dec = 2;
        total += dec;

    } else if (letterGrade1.equals("D") || letterGrade1.equals("d")){
        dec = 1;
        total += dec;

    } else if (letterGrade1.equals("F") || letterGrade1.equals("f")){
        dec = 0;
        total += dec;
      }//end of if


      double GPA = total / classes;

      DecimalFormat formatter = new DecimalFormat("0.##");
      System.out.println( formatter.format("Your GPA is " + GPA));

    /*System.out.print("Please enter credit hours for the course(2): ");
  		creditHours2 = in.nextLine();
    System.out.print("Please enter credit hours for the course(3): ");
    	creditHours3 = in.nextLine();
    System.out.print("Please enter credit hours for the course(4): ");
      creditHours4 = in.nextLine();*/

    in.close();//close the scanner
  }
}//end class
