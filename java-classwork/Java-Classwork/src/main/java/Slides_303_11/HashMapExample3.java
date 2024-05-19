package Slides_303_11;

import java.util.HashMap;
//Write a Java program to copy all mappings from the specified map to another map.

public class HashMapExample3 {
    public static void main(String args[]) {

        // create two hash maps

        HashMap <Integer, String> hash_map1 = new HashMap<Integer, String> ();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String> ();

        //populaet hash maps

        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map" + hash_map1);
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);

        //put all values in secondmap
        hash_map2.putAll(hash_map1);
        System.out.println("\nValues in second map" + hash_map2);


    }

}
