import java.io.*;
import java.util.*;

public class Greeter {

public static void generationGreet(String name, int number){
  System.out.println("Good morning " + name + " the " + number);
}

public static void namedGreet(String name){
  System.out.println("Good Morning " + name);
  greet();
}


public static void greet(){
  System.out.println("Hey!");

}

public static void goodbye(){
  System.out.println("Bye!");
}

public static void main(String[]
args){
  System.out.println("Hello World!");

  greet();
  namedGreet("Los");
  namedGreet("Liv");
  generationGreet("Charles" ,3);



  goodbye();
}

}