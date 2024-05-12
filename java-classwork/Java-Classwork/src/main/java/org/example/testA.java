package org.example;

public class testA {
    public static void main(String[] args) {

        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum1 = 0;
        for (String string : nums) {
            int value = Integer.valueOf(string);
            sum1 = sum1 + value;
        }
        System.out.println(sum1);
    }
}

