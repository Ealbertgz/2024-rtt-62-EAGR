package org.example.PA_303_3_1;

import java.util.Scanner;

public class Homework_3_3_1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String ReversedA = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(ReversedA) ? "Yes" : "No");
    }
}