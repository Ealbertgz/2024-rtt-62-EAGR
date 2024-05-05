package org.example.PA_303_5_1;


public class Homework_303_5_1_3 {
    public static void main(String[] args) {

        double Tuition = 10000;
        double Increase = .07;
        int years = 0;

        while ( Tuition < 20000){
            Tuition = Tuition + (Tuition * Increase);
            years++;
            System.out.println("After " + years + " years, the tuition is $ " + Tuition + ".");
        }
        System.out.println("It will take " + years + " years for the tuition to double ");


    }
}