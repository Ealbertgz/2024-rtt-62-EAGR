package org.example.PA_303_2_3_2;
//    3.	Write a program that declares three int variables:
//    x, y, and z. Assign 7 to x and 17 to y.
//    4.	Now, with the preceding values, use the bitwise and
//    operator to calculate the “or” value between x and y. As before,
//    write a comment that indicates what you
//    predict the values to be before printing them out.
public class Homework303_2_3_4 {
    public static void main(String[] args) {
        //prediction : z = 23
        int x=7;
        int y=17;
        int z = x|y;
        System.out.println(z);
        String binary1 = Integer.toBinaryString(z);
        System.out.println(z +" in binary is: " + binary1 );

    }

}
