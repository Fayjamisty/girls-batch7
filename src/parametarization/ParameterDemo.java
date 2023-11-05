package parametarization;

public class ParameterDemo {

     // parameterization is a part of the method signature.
     public void play(String game){

         System.out.println(game);

     }

     public static void main(String[] args) {
        ParameterDemo Arafat = new ParameterDemo(); // object of the class
        Arafat.play("cricket");


        ParameterDemo Farzana = new ParameterDemo(); // object of the class
         Farzana.play("hockey");


         ParameterDemo Shefali = new ParameterDemo(); // object of the class
         Shefali.play("soccer");
    }


/*

1. What is static in Java?
Static keyword can be applied to variables and method.
This belongs to the class not to the instance, but this is common to all instances.

2. can we call a non-static variable in static method?
No

3.Can a static method be called in non-static method?
yes

4.Why is the main method static?
Because compiler needs to call it without creating an object.
Another reason is in java Program compiler starts executing programs from main method.

5.can static method or static variable be private?
yes

6. What is difference between static and constant?
constant is variable are fixed during compile time with value doesn't change in the runtime.
But static variables can be changed in the time.

 */





}
