package conditionalStatement;

import java.util.Scanner;

public class Mark {
  static int Number = 20;
  public void practice() {

    // String myNo = scan.nextLine();
// System.out.println("My No is' + my no);


   /*
    Ask user to enter any number and through your code u print the number

     */

  }

  public static void main(String[] args) {

//  +  Scanner scan = new Scanner(System.in);
////      //   System.out.println("Enter your No below : ");
////    int myNo = scan.nextInt();
////    System.out.println("My No is " myNo);
//
//     int num = scan.nextInt();
//      if (num == 20);
//          System.out.println("num is 20");





  }

    public void grade() {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if (mark < 25) {
            System.out.println("The student got F ");
        }
        if ((mark==25)||(mark<45)) {
            System.out.println("The student got E");
        }

        if ((mark==45)||(mark<50)) {
            System.out.println("The student got D");
        }

        if ((mark==50)||(mark<60)) {
            System.out.println("The student got C");
        }

        if ((mark==60)||(mark<80)) {
            System.out.println("The student got B");
        }

        if ((mark == 80) || (mark > 80)){
            System.out.println("The student got A");
        }


    }



  }
