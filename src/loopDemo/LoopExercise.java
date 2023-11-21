package loopDemo;

public class LoopExercise {

  /* what is loop?
       ans- Repeating a block of code...

   */
public void whileloop(){
    int a = 10; // initialization
    while (a<=50) {  // condition
        System.out.println(a);

      a++; // increase by 1 -- increment
    }

    // print 50---1 using while loop
    System.out.println("---------");

    int b = 50;
       while (b>=10){
           System.out.println(b);

           b--; // 50,49,48,47 - decrement
       }

    // print 1---50 in 2 intervals

    int c = 1 ;
       while (c>=50){

           c = c+2 ; // increase by 2 --- increment
       }

}

    // forloop
    public void forloop(){

    for (int a = 1;a <=10;a++){
        System.out.println(a);
    }
}

    // do_while loop--- it will run block at least 1 time

   public void dowhileloop(){
     // print 5-10

       int d = 5;

       do{
           System.out.println(d);
       d++;//7

       }
      while (d<=10);

}


    public static void main(String[] args) {
       LoopExercise obj = new LoopExercise();
      // obj.whileloop();
      //  obj.forloop();
      obj.dowhileloop();
}



}
