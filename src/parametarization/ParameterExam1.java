package parametarization;

public class ParameterExam1 {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");

    }


    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");


        System.out.println("Liam");
        System.out.println("Jenny");
        System.out.println("Anja");


    }
}