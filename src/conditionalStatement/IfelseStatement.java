package conditionalStatement;

import java.util.Scanner;

public class IfelseStatement {

    static int age = 15;

    public static void ifelse() {

        if (age == 10) {
            System.out.println("age is 10");
        } else if (age == 15) {
            System.out.println("age is 15");
        } else if (age == 20) {
            System.out.println("age is 20");
        } else {
            System.out.println("none of the avobe");
        }
    }

        public void practice(){

        /*
            i.A school has following rules for grading system:
             a. Below 25 - F
             b. 25 to 45 - E
             c. 45 to 50 - D
             d. 50 to 60 - C
             e. 60 to 80 - B
             f. Above 80 - A
           Ask user to enter marks and print the corresponding grade.

            ii. Ask user to enter any number and through your code u print the number

        */


    }


    public void grade(){
        Scanner scan = new Scanner(System.in);
        String mygrade = scan.nextLine();
        System.out.println("Enter your marks : ");

        int mymarks = scan.nextInt();
        System.out.println("My marks is " + 25);






    }
    public static void main(String[] args) {
        ifelse();
    }


}
