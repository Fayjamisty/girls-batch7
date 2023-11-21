package conditionalStatement;

import java.util.Scanner;

public class PositiveNegative {

    //take a number from user find that the number is positive or negative
    //0,1,2,3, any number from 0 to up is positive, any number less than 0 is negative
    //-2,-1,-1.4563,-0.1

    public void PositiveNegative(){

     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();

     if (a== 0) {
         System.out.println("positive");
     }

     if (a>0){
         System.out.println("Positive");
     }

     if (a<0){
         System.out.println("Negative");
     }

    }


    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.PositiveNegative();


    }




}
