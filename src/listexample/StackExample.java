package listexample;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stck1 = new Stack<>();

        // pushing the elements into the stack
        stck1.push(23);
        stck1.push(44);
        stck1.push(12);
        stck1.push(99);

        System.out.println("stck1 is : "+stck1);

        stck1.pop();
        System.out.println("stck1 after 1st pop : "+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : "+stck1);

        System.out.println("traversing");
        for(Integer s1:stck1){
            System.out.println(s1);
        }

    }
}
