package dataTypesPackage;



public class DataTypes {

    public static void main(String[] args) { // main methods used for command

        // Program is a set of instruction for the computer to follow
        // Class can hold what? i. Variables ii. Methods ( Function)

//String group = "Evening";
//int batch = 7;

       // ( ) -- Parenthesis
        // { } -- carle Braces
        // [ ] -- Square Bracket


        /* There are two types of methods
        i. main method -- very special -- comung from java-- all commands come from here
        ii. custom method -- creating by us-- for particular groups of code
         */



    /* There are many types of data.

         i. byte -- it can store whole numbers upto 127;
        ii. short -- Stores whole numbers upto 32,767
        iii. int -- stores whole numbers upto 2,147,483,647
         iv. long -- stores whole numbers upto 9,223,72,036,854,775,807
          v. float -- stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
         vi. double -- stores fractional numbers. Sufficient for storing 15 decimal digits
        vii. boolean -- stores true or false values
      */


        String name = "Fayja"; // variable... name, value = bashir, data type = String
     byte age = 100; // variable = age, value = 100, data type = int (integer-- number)
//      System.out.println(name);
//      System.out.println(age);
        short CheckingAccount = 32767;
        int savings = 2147483647;
        long regnum = 922372036854775807L;
        float height = 5.533434f;
        double stock = 5435.2058403258345454;
        boolean sleepingInTheClass = true;
        char middleIntial = 'B';


        System.out.println("The checking account balance is " + CheckingAccount);
        System.out.println("The savings account balance is " + savings);
        System.out.println("The regrum number is " + regnum);
        System.out.println("The height is " + height);
        System.out.println("The stock number is " + stock);
        System.out.println("The sleepingInTheClass value is " +sleepingInTheClass);
        System.out.println("The middleIntial is " + middleIntial);


        System.out.println(CheckingAccount);
        System.out.println(savings);
        System.out.println(regnum);
        System.out.println(height);
        System.out.println(stock);
        System.out.println(sleepingInTheClass);
        System.out.println(middleIntial);




    }




}







