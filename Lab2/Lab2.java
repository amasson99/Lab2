import java.util.*;

public class Lab2 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);// Declare a Scanner object here to be used for input

    double creditHours = 0;
    String letterGrade1;
    double total = 0;
    double dec = 0;
    String input ;

    System.out.print("Please enter credit hours for the course(1): ");
			input = in.nextLine();
      creditHours += Double.parseDouble(input);

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

    } else {
        dec = 0;
        total += dec;
    }//end of if


    double GPA = (total * creditHours) / creditHours;

    System.out.printf("Your GPA is %.2f\n", GPA);

    in.close();//close the scanner
  }
}//end class
