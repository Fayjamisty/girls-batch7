package operators;

public class RelationalOperators {

    // >,<, >=, <=, ==, != . These will not going to return a value. these will give only true or false

    static int a = 20; // static variable
    static int b = 9; // static variable


    public static void relation(){

        boolean result1 = a>b;
         System.out.println(result1);

        boolean result2 = a<b;
          System.out.println(result2);

        boolean result3 = a>=b;
          System.out.println(result3);

        boolean result4 = a<=b;
          System.out.println(result4);

        boolean result5 = a==b;
          System.out.println(result5);


    }


    public static void main(String[] args) {
 //        RelationalOperators obj = new RelationalOperators();
 //        obj.relational();
            relation();

    }




}
