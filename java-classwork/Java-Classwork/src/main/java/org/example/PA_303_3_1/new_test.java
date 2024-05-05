package org.example.PA_303_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class new_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the length of the substrings to find: ");
        int substringLength = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        for (int i = 0; i <= inputString.length() - substringLength; i++) {
            String currentSubstring = inputString.substring(i, i + substringLength);
            char[] chars = currentSubstring.toCharArray();
            Arrays.sort(chars);
            String sortedSubstring = new String(chars);

            System.out.println(sortedSubstring);
        }

        scanner.close();
    }
}

