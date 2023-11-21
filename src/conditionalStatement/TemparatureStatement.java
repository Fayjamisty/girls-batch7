package conditionalStatement;

import java.util.Scanner;

public class TemparatureStatement {

    /* Take a temoarature as user input as Farenheit...
    if it is 30-49 print cold
    if it is 50-69 print warm
    if it is 70-89 - it is super hot visit Bangladesh/India
     */
 public void temparature(){

     Scanner scan = new Scanner(System.in);
     int temparature = scan.nextInt();

     if ((temparature==30)||(temparature<49)) {
         System.out.println("cold");
     }

     if ((temparature==49)||(temparature<69)) {
         System.out.println("Warm");
     }

     if ((temparature==69)||(temparature<89)) {
         System.out.println("It is super hot visit Bangladesh/India");
     }
 }


    public static void main(String[] args) {
        TemparatureStatement obj = new TemparatureStatement();
        obj.temparature();


 }





}
