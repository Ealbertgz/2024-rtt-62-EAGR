package Slides_303_11;

import java.util.HashMap;

public class HashMapExample8 {
//    Write a Java program to test if a map contains a mapping for the specified value.
    public static void main(String args[]) {
        HashMap < Integer, String> hash_map = new HashMap< Integer, String>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");

        //print the map
        System.out.println("The original map: " + hash_map);
        System.out.println("1. Is the value \'Green\' exists?") ;
        if (hash_map.containsValue("Green")) {
            //value exists
            System.out.println("Yes!");
        } else {
            //value does not exist
            System.out.println("No!");
        }

        System.out.println("\n2. Is value \'Orange\' exists");
        if(hash_map.containsValue("orange")){
            System.out.println("yes! - ");
        } else {
            System.out.println("No!");
        }


    }
}
