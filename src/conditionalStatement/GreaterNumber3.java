package conditionalStatement;

public class GreaterNumber3 {

 public void GreaterNumber(int x, int y, int z){


    /*
    x = 4
    y = 3
    z = 2

   */

    if((x>y) && (x>z)){
       System.out.println(x + " is the greater number");
    }

    else if((y>x) && (y>z)){
        System.out.println(y + " is the greater number");
    }

     else if ((z>x) && (z>y)){
         System.out.println(z + " is the greater number");
     }



 }


    public static void main(String[] args) {
        GreaterNumber3 obj = new GreaterNumber3();
         obj.GreaterNumber(4,6 ,2);

 }

}
