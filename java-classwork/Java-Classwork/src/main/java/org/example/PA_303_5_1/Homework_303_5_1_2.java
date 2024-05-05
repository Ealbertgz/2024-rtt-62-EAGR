package org.example.PA_303_5_1;

import java.util.Scanner;

public class Homework_303_5_1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 :  ");
        int n = sc.nextInt();

        System.out.println("Enter number2 :  ");
        int n2 = sc.nextInt();

        int gcd = gcdFinder(n, n2);

        System.out.println("The greatest common divisor of " + n + " and " + n2 + " is " + gcd + ".");
    }
    private static int gcdFinder(int a, int b){
    if (b==0) {
        return a;
    } else {
        return gcdFinder(b, a % b);
    }
        }

    }

