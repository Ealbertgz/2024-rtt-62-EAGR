import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

class Exception_HandlingTest {
    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
        try {
            System.out.println("Dividing by " + divideBy + ":");
            if (startAt < endAt) {
                for (int i = startAt; i <= endAt; i++) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            } else {
                for (int i = startAt; i >= endAt; i--) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}

        // Add catch blocks to handle any exceptions that may occur.



public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Exception_HandlingTest.iterateAndDivide(arr, 2, 4, 2);
        Exception_HandlingTest.iterateAndDivide(arr, 2, 20, 1);
        Exception_HandlingTest.iterateAndDivide(arr, 10, 2, 0);
        Exception_HandlingTest.iterateAndDivide(arr, 10, -1, -2);
    }
}