package loopDemo;

import conditionalStatement.PositiveNegative;

import java.util.Scanner;

public class PositiveNegative2 {

    // Write a function that and create a loop between 1-10.
    // And determine which number is positive and which number is negative.

    public void forloop() {

        for (int a = 1; a <= 10; a++) {
            System.out.println("positive");

        }

        for (int a = -1; a <= 10; a++) {
            System.out.println("Negative");
        }


    }

    public static void main(String[] args) {
        PositiveNegative2 obj = new PositiveNegative2();
        obj.forloop();

    }


}
