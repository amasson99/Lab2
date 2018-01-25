import java.util.*;

public class Lab2 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);// Declare a Scanner object here to be used for input

    double creditHours1 = 0;
    double creditHours2 = 0;
    double creditHours3 = 0;
    String letterGrade1;
    String letterGrade2;
    String letterGrade3;
    double total1 = 0;
    double total2 = 0;
    double total3 = 0;
    double dec = 0;
    String input ;

    System.out.print("Please enter credit hours for the course(1): ");
			input = in.nextLine();
      creditHours1 += Double.parseDouble(input);

    System.out.print("Please enter the letter grade recieved for the course(1): ");
  		letterGrade1 = in.nextLine();

    if (letterGrade1.equals("A") || letterGrade1.equals("a")){
        dec = 4;
        total1 += dec;

    } else if (letterGrade1.equals("B") || letterGrade1.equals("b")){
        dec = 3;
        total1 += dec;

    } else if (letterGrade1.equals("C") || letterGrade1.equals("c")){
        dec = 2;
        total1 += dec;

    } else if (letterGrade1.equals("D") || letterGrade1.equals("d")){
        dec = 1;
        total1 += dec;

    } else if (letterGrade1.equals("F") || letterGrade1.equals("f")){
        dec = 0;
        total1 += dec;
    } else {
      System.out.println("Invalid Grade");
      System.exit(0);
    }//end of if

    System.out.print("Please enter credit hours for the course(2): ");
			input = in.nextLine();
      creditHours2 += Double.parseDouble(input);

    System.out.print("Please enter the letter grade recieved for the course(2): ");
  		letterGrade2 = in.nextLine();

    if (letterGrade2.equals("A") || letterGrade2.equals("a")){
        dec = 4;
        total2 += dec;

    } else if (letterGrade2.equals("B") || letterGrade2.equals("b")){
        dec = 3;
        total2 += dec;

    } else if (letterGrade2.equals("C") || letterGrade2.equals("c")){
        dec = 2;
        total2 += dec;

    } else if (letterGrade2.equals("D") || letterGrade2.equals("d")){
        dec = 1;
        total2 += dec;

    } else if (letterGrade2.equals("F") || letterGrade2.equals("f")){
        dec = 0;
        total2 += dec;
    } else {
      System.out.println("Invalid Grade");
      System.exit(0);
    }//end of if

    System.out.print("Please enter credit hours for the course(3): ");
      input = in.nextLine();
      creditHours3 += Double.parseDouble(input);

    System.out.print("Please enter the letter grade recieved for the course(3): ");
      letterGrade3 = in.nextLine();

    if (letterGrade3.equals("A") || letterGrade3.equals("a")){
        dec = 4;
        total3 += dec;

    } else if (letterGrade3.equals("B") || letterGrade3.equals("b")){
        dec = 3;
        total3 += dec;

    } else if (letterGrade3.equals("C") || letterGrade3.equals("c")){
        dec = 2;
        total3 += dec;

    } else if (letterGrade3.equals("D") || letterGrade3.equals("d")){
        dec = 1;
        total3 += dec;

    } else if (letterGrade3.equals("F") || letterGrade3.equals("f")){
        dec = 0;
        total3 += dec;
    } else {
      System.out.println("Invalid Grade");
      System.exit(0);
    }//end of if

    double grade1 = (total1 * creditHours1);
    double grade2 = (total2 * creditHours2);
    double grade3 = (total3 * creditHours3);
    double gradeTotal = grade1+grade2+grade3;
    double creditHoursTotal = creditHours1+creditHours2+creditHours3;

    double GPA = gradeTotal/ creditHoursTotal;
    System.out.println("Grade Total = " + gradeTotal);
    System.out.println("Credit Hours Total = " + creditHoursTotal);
    System.out.printf("Your GPA is %.2f\n", GPA);

    in.close();//close the scanner
  }
}//end class
