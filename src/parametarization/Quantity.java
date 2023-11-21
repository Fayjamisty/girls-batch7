package parametarization;

import scanning.ScannerDemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quantity {

     /* A shop guves discount of 10% if the cost of purchased quantity
     is more than 1000 unit ask user for quantity suppose.one unit will cost $20.
      */

public void discount(){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the quantity");
    int quantity = scan.nextInt();
    int total_cost = quantity * 20;
    if (quantity > 1000){
        int discount = ((total_cost/100)*10);
        System.out.println(discount);
    }

    else{
        System.out.println("No discount");
    }


}

public static void main(String[] args) {

  Quantity obj = new Quantity();
   obj.discount();




    }


}
