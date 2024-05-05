package org.example.PA_303_3_1;

import java.util.Arrays;

public class Homework_303_3_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int sumOfLengths = str1.length() + str2.length();

        System.out.println("The sum of the lengths of the two strings is: " + sumOfLengths);

        int comparisonResult = str1.compareTo(str2);
        if(comparisonResult > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String output = str1.substring(0,1).toUpperCase() + str1.substring(1).toLowerCase() +" " + str2.substring(0);
        System.out.println(output);
    }
}
