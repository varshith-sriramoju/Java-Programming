package t8Collections;
import java.util.*;
public class stack { //LIFO
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("cat");
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Tiger");
        System.out.println("Stack:"+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
          
    }
}
