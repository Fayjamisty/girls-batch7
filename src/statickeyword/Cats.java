package statickeyword;

public class Cats {
    // instance variable

      /*
        Class - cats -- name, size, color, tail, eyes
        Objects -- mycat, yourcat, Shorna's cat, Diksha's cat
   */

    String name;
    String color;
    String size;
    String tail;
    String eyes;

    public static void main(String[] args) {

        Cats mycat = new Cats(); // Created an object of the class. that means i instantiation the class.
        mycat.name = "kitty";
        mycat.size = "small";
        mycat.color = "white";
        mycat.tail = "long";
        mycat.eyes = "brown";


        Cats yourcat = new Cats(); // Created an object of the class. that means i instantiation the class.
        yourcat.name = "Yourcat";
        yourcat.color = "yellow";
        yourcat.size = "midium";
        yourcat.tail = "tall";
        yourcat.eyes = "blue";

    }


}





