package org.example.PA_303_4_1;

import java.util.Scanner;

public class Homework_303_4_7 {
    public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("What is your marital status: ");
            String mStatus = myObj.nextLine();  // Read user input

            System.out.println("What is your income: ");
            int income = myObj.nextInt();  // Read user input


            //single
            if (income >= 0 && income <= 8350 && mStatus.equals("single")) {
                System.out.println("Your tax rate is 10%");
            } else if (income >= 8351 && income <= 33950 && mStatus.equals("single")) {
                System.out.println("Your tax rate is 15%");
            } else if (income >= 33951 && income <= 82250 && mStatus.equals("single")) {
                System.out.println("Your tax rate is 25%");
            } else if (income >= 82251 && income <= 171550 && mStatus.equals("single")){
                System.out.println("Your tax rate is 28%");
            } else if (income >= 171551 && income <= 372950 && mStatus.equals("single")) {
                System.out.println("Your tax rate is 33%");
            } else if (income >= 375951 && mStatus.equals("single")) {
                System.out.println("Your tax rate is 35%");
            }

            //Married Jointly
            if (income >= 0 && income <= 16700 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 10%");
            } else if (income >= 16701 && income <= 67900 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 15%");
            } else if (income >= 67901 && income <= 137050 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 25%");
            } else if (income >= 137051 && income <= 208850 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 28%");
            } else if (income >= 208851 && income <= 372950 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 33%");
            } else if (income >= 375951 && mStatus.equals("married jointly")) {
                System.out.println("Your tax rate is 35%");
            }

            //Married Separately

            if (income >= 0 && income <= 8350 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 10%");
            } else if (income >= 8351 && income <= 33950 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 15%");
            } else if (income >= 33951 && income <= 68525 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 25%");
            } else if (income >= 68526 && income <= 104425 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 28%");
            } else if (income >= 104426  && income <= 186475 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 33%");
            } else if (income >= 186476	 && mStatus.equals("married separately")) {
                System.out.println("Your tax rate is 35%");
            }


            // Head household

            if (income >= 0 && income <= 11950 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 10%");
            } else if (income >= 11951 && income <= 45500 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 15%");
            } else if (income >= 45501  && income <= 117450 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 25%");
            } else if (income >= 117451  && income <= 190200 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 28%");
            } else if (income >= 190201 && income <= 372950 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 33%");
            } else if (income >= 375951 && mStatus.equals("head household")) {
                System.out.println("Your tax rate is 35%");
            }

        }
    }
