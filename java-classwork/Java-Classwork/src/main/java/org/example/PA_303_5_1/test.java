package org.example.PA_303_5_1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tuition:");
        double nTuition = sc.nextDouble();
        System.out.println("Enter tuition rate:");
        double nTuititionRate = sc.nextDouble() ;
        double previousTuition = nTuition;


        for (int i = 1; i <= 12; i++) {
            System.out.println("Year " + i  );
            for (int j = 1; j <= 12; j++) {
                nTuition = nTuition * (1+ nTuititionRate /100);
                if (nTuition >= previousTuition * 2) {
                    System.out.println(" Tuition doubles in Year" + i+ "Month" +j);
                    return  ;
                }
                System.out.println(" " + nTuition);
                previousTuition = nTuition;
            }
        }
    }
}