package org.example;

public class IfStatements {
    public static void main(String[] args) {

        int x = 90;

        if ( x< 10) {
            System.out.println("Less than 10 - " + ( x < 10));

        }   else if (x <20) {
            System.out.println("Less than 20");
        }  else if (x<30) {
            System.out.println("Less than 30");
        } else {
            System.out.println("Greater than 30");
        }
    }
}
