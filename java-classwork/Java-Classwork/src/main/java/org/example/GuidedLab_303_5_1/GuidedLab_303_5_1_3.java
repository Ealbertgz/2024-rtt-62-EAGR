package org.example.GuidedLab_303_5_1;

import java.util.Scanner;

public class GuidedLab_303_5_1_3 {
    public static void main(String[] args) {

        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome: ");
        original = in.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--);
        if (original.equals(reverse)){
            System.out.println("Entered string/number is a palindrome. ");

        }else {
            System.out.println("Entered string/number is not a palindrome.");
        }
    }
}
