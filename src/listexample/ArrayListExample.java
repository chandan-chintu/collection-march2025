package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        //wrapper class
//        int a=100;
//        Integer b=200;
//        int d=null; - not possible
//        Integer c = null;
        // added lines
        // added lines

        //defining the arraylist
        List<Integer> list1 = new ArrayList<>();
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

        // summing the data
        System.out.println("summing the list1 with foreach loop");
        int totalCount = 0;
        for(Integer l1 : list1){
            totalCount= totalCount+l1;
        }
        System.out.println("sum is :"+totalCount);


        List<Object> list2 = new ArrayList<>();

        list2.add(23);
        list2.add("yeuiwsk");
        list2.add(34.44f);
        list2.add(34.555);
        list2.add(true);

        System.out.println("list2 is : "+list2);

        List<List<Integer>> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list4.add(23);
        list4.add(44);
        list4.add(12);
        List<Integer> list5 = new ArrayList<>();
        list5.add(00);
        list5.add(99);
        list5.add(88);

        list3.add(list5);
        list3.add(list4);

        System.out.println("list3 is  : "+list3);

    }
}
