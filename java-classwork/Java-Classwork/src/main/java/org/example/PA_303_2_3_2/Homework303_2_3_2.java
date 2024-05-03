package org.example.PA_303_2_3_2;

public class Homework303_2_3_2 {
    public static void main(String[] args){
//        //Write a program that declares a variable x,
//        and assigns 150 to it, and prints out the binary
//        string version of the number. Now use the right shift operator
//        (>>) to shift by 2 and assign the result to x.
//        Write a comment indicating what you anticipate the decimal
//        and binary values to be. Now print the value of x and the binary string.
//        Perform the preceding exercise with the following values:
//        a.	225
//        b.	1555
//        c.	32456
        int x =150;
        String binary1 = Integer.toBinaryString(x);
        System.out.println(Integer.toBinaryString(x));
        int n = 2;
        int answer = x << n;
        System.out.println("Right shift " + x + " by " + n + " positions: " + answer);
        x = answer;

        int y =225;
        String binary2 = Integer.toBinaryString(y);
        System.out.println(Integer.toBinaryString(y));
        int answer2 = y << n;
        System.out.println("Right shift " + y + " by " + n + " positions: " + answer2);
        y = answer2;

        int z =1555;
        String binary3 = Integer.toBinaryString(z);
        System.out.println(Integer.toBinaryString(z));
        int answer3 = z << n;
        System.out.println("Right shift " + z + " by " + n + " positions: " + answer3);
        y = answer3;

        int r =32456;
        String binary4 = Integer.toBinaryString(r);
        System.out.println(Integer.toBinaryString(r));
        int answer4 = r << n;
        System.out.println("Right shift " + r + " by " + n + " positions: " + answer4);
        y = answer2;


    }
}
