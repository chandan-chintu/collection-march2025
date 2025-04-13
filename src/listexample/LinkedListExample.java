package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //defining the arraylist
        List<Integer> list1 = new LinkedList<>();
        // adding or inserting data
        list1.add(23);
        list1.add(12);
        list1.add(9);
        list1.add(44);
        list1.add(34);
        list1.add(12);
        //list1.add(7,100);
        // list1.add(null);
        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(1);
        System.out.println("list1 after removing 1st index : "+list1);
// added lines
        // added lines
        //search list at specific position
        System.out.println("list1 0th index element is : "+list1.get(0));
        System.out.println("list1 3rd index element is : "+list1.get(3));

        // update the list
        list1.set(2,55);
        System.out.println("list1 after updating the 2nd index : "+list1);

        // size of the list
        System.out.println("list1 size is : "+list1.size());

        // sorting the list
        Collections.sort(list1);
        System.out.println("list1 after sorting : "+list1);

        // traversing the data
        System.out.println("traversing the list1 with foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
