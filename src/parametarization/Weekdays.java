package parametarization;

import java.util.Scanner;

public class Weekdays {

    // write a java program that takes a number
    // fromthe user and genarates an integar between
    // 1 and 7.it displays the weekday name.
    public void weekdays(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a == 1 ){
            System.out.println("Sunday");
        }

         if (a==2){
             System.out.println("Monday");
         }

          if (a==3){
              System.out.println("Tuesday");
          }

           if (a==4){
               System.out.println("Wednesday");
           }

            if (a==5){
                System.out.println("Thursay");
            }

             if (a==6){
                 System.out.println("Friday");
             }

              if (a==7){
                  System.out.println("Saturday");
              }

    }


    public static void main(String[] args) {

        Weekdays obj = new Weekdays();
        obj.weekdays();



    }





}





