package statickeyword;

public class Fruits {
       // instance variable

    String name; // instance variable/properties //declaring the variable
    String color;  //declaring the variable
   static String size = "small"; // ststic methods and variables belongs to class not objects //declaring thw veriable
    String vitamin;  // declaring the variable

// when we see value of variable/variables are common to all objects

    public void hello () {
        String location = "USA"; // local variable

        System.out.println(location); // use the variable

    }

    public void price(int amount){
        System.out.println(amount);
        hello();
    }

    /*
       class - Fruits --name, color, size, vitamin -- properties
       objects - banana, Apple, Mango, Avocado, Grape, Orance

       Class - vegetables -- name,color,size,vitamin,nutrition, price
       Objects - Tomatoes, Cucumber, Potato, carrots, Cabbage

       Class - cats --  size, color, tail, eyes
       Objects -- mycat, yourcat, Shorna's cat, Diksha's cat

       Class - UprightStudents -- name, id, group,batch
       Objects -- Shorna, Majed, sadia,dharti,Diksha,Lota,Jannat

        */

    /*
    variable has 3 parts --
    i. declare the variable
   ii.initialize the variable
  iii. use the variable
     */

    public static void main(String[] args) {
        Fruits banana = new Fruits();  // created an object of the class.that means I instantiated the class.
       banana.name = "Banana";  // initializing/defining the veriable  // banan is a refrence veriable or obj
       banana.color = "yellow";  // initializing/defining the variable
       //banana.size = "small";   // initializing/definig the variable
       banana.vitamin = "c";  // initializing/definig the variable
       System.out.println(banana.name);  // using the variable
       System.out.println(banana.color);  // using the variable
       System.out.println(banana.vitamin);  // using the variable
       System.out.println(size); // using the variable

        banana.hello();  // calling the method

        Fruits apple  = new Fruits();  // created an object of the class.that means I instantiated the class.
        apple.name = "Apple";  // initializing/defining the variable
        apple.color = "red";  //initializing/defining the variable
        //apple.size = "small"; // initializing/defining the variable
        apple.vitamin = "E";  // initializing/defining the variable

        System.out.println(apple.name);  // using the variable
        System.out.println(apple.color);  // using the variable
        System.out.println(apple.vitamin);  // using the variable
        System.out.println(size);  // using the variable

        apple.hello();  // calling the method

        Fruits mango = new Fruits();  // created an object of the class.that means i instantiated the class.
        mango.name = "Mango";  // initializing/defining the variable
        mango.color = "yellow";  // initializing/defining the variable
        //mango.size = "small";  // initializing/defining the variable
        mango.vitamin = "c";  // initializing/defining the variable

        System.out.println(mango.name);  // using the variable
        System.out.println(mango.color);  // using the variable
        System.out.println(mango.vitamin);  // using the variable
        System.out.println(size);   // using the variable

        mango.hello(); //calling the method

    }

}
