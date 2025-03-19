package setexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();

        // add element
        set1.add("mango");
        set1.add("banana");
        set1.add("guava");
        set1.add("pineapple");
        //set1.add(null);
        set1.add("mango");

        System.out.println("set1 is : "+set1);

        set1.remove("mango");
        System.out.println("set1 after removing : "+set1);

        // size
        System.out.println("set1 size is : "+set1.size());

        System.out.println("traversing");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
