package org.example.PA_303_4_1;
// Write a program that uses if-else-if statements to print
// out grades A, B, C, D, F, according to the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: <60
//Use the Scanner class to accept a number score from
// the user to determine the letter grade.
// Print out “Score out of range” if the score is less than 0 or greater than 100.

import java.util.Scanner;

public class Homework_303_4_5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter grade: ");

        int grade = myObj.nextInt();  // Read user input
        if (grade >= 90 && grade <=100) {
            System.out.println("You get an A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("You get a B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("You get a C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("You get a D");
        } else if (grade < 60 && grade > 0) {
            System.out.println("You get an F");
        } else if (grade <= 0 ) {
            System.out.println("out of range");
        } else if (grade > 100) {
            System.out.println("out of range");
        }
    }
}