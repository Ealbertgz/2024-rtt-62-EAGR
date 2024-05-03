package org.example.PA_303_2_3_2;

public class Homework303_2_3_1 {
    public static void main(String[] args) {


    int x =2;
    String binary1 = Integer.toBinaryString(x);
    System.out.println(Integer.toBinaryString(x));
    int n = 1;
    int answer = x << n;
    System.out.println("Left shift " + x + " by " + n + " positions: " + answer);
    x = answer;

    int y = 9;
    int answer2 = y << n;
    System.out.println("Left shift " + y + " by " + n + " positions: " + answer2);
    y= answer2;

    int z = 17;
    int answer3 = z << n;
    System.out.println("Left shift " + z + " by " + n + " positions: " + answer3);
    z= answer3;

    int r = 88;
    int answer4 = r << n;
    System.out.println("Left shift " + r + " by " + n + " positions: " + answer4);
    r= answer4;
    }
}
