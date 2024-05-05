package org.example.PA_303_3_1;

import java.util.Scanner;

public class Homework_3_3_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();

        if (s.length() == 0) {
            System.out.println("0");
        } else {
            String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}