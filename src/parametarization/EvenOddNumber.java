package parametarization;

public class EvenOddNumber {
  /* write a java function and take an int perameter and
  determine that the number is divided by 2 that is even else the number is odd
   */


    public void evenoddNumber(int number){

    if (number %2 == 0) {
        System.out.println(number + " is the even number");
    }

    else if(number %2 == 1){
        System.out.println(number + " is an oddnumber");
        }



    }

    public static void main(String[] args) {
       EvenOddNumber obj = new EvenOddNumber();
        obj.evenoddNumber(15);
    }

}
