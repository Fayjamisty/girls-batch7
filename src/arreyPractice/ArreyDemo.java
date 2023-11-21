package arreyPractice;

import java.sql.Array;

public class ArreyDemo {

    // student name is array variable
    // array length is fixed in size
    // we cannot add or remove any element later
    String[] studentName = {"Arafat" , "Jobayda" , "Urmi" , "Razia"}; // Array Data
     // length of this array = 4
    // what is the last index here ----- 3
    // student name is array variable
    String location = "Texas";

   public void arr() {
       System.out.println(studentName[0]);
       System.out.println(studentName[1]);
       System.out.println(studentName[2]);
       System.out.println(studentName[3]);
       System.out.println(studentName[4]);
       // System.out.println(studentName[4]);
       //System.out.println(location);

       // print 10,15,30,60

       // int []my num = {10,15,30,60};

       for (String m : studentName) { // for each loop
           System.out.println(m);

       }
       // for (int i = 0; i<studentName.length; i++){
       //System.out.println(studentName[i]);
       // }

   }

    public static void main(String[] args) {

       ArreyDemo obj = new ArreyDemo();
       obj.arr();


    }



}
