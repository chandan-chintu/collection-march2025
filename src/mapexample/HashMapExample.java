package mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        // add the data
        map1.put(103, "Banana");
        map1.put(105, "Apple");
        map1.put(107,"Orange");
        map1.put(null,"Pineapple");
        map1.put(101,null);
        map1.put(102,"Guava");
        map1.put(104,null);
        map1.put(106,"Guava");
        map1.put(107,"Mango");// orange will be removed and mango will be updated
        map1.put(103,"Orange"); // banana is removed and orange is updated
        System.out.println("map1 is : "+map1);

        map1.remove(104);
        System.out.println("map1 after removing 104 key : "+map1);

        // traversing
        System.out.println("travering map");
        for(Map.Entry m1: map1.entrySet()){
            System.out.println(m1.getKey()+"--------"+m1.getValue());
        }
    }
}
