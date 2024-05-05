package org.example.PA_303_3_1;

import java.util.Scanner;

public class Homework_303_3_1_2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the string: ");
    String str = scanner.nextLine();

    System.out.print("Enter the start index: ");
    int start = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter the end index: ");
    int end = scanner.nextInt();

    System.out.println(str.substring(start,end));
    scanner.close();
    }
}

