package org.example;

import java.util.Arrays;

public class test {
    public static void main(String[] args)
    {
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Random numbers = "+ Arrays.toString(arr));
    }

}
