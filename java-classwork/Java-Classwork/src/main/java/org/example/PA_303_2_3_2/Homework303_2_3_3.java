package org.example.PA_303_2_3_2;
//    3.	Write a program that declares three int variables:
//    x, y, and z. Assign 7 to x and 17 to y.
//    Write a comment that indicates what you predict
//    will be the result of the bitwise and operation on x and y.
//    Now use the bitwise AND (&)
//    operator to derive the decimal and binary values,
//    and assign the result to z.
public class Homework303_2_3_3 {
public static void main(String[] args) {
   //prediction : z = 1
    int x=7;
    int y=17;
    int z = x&y;
    System.out.println(z);
    String binary1 = Integer.toBinaryString(z);
    System.out.println(z +" in binary is: " + binary1 );

}

}
