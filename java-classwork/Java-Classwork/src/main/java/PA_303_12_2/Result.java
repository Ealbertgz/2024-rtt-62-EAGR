//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//
//class Result {
//    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
//        try {
//            System.out.println("Dividing by " + divideBy + ":");
//            if (startAt < endAt) {
//                for (int i = startAt; i <= endAt; i++) {
//                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
//                }
//            } else {
//                for (int i = startAt; i >= endAt; i--) {
//                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//
//        Result.iterateAndDivide(arr, 2, 4, 2); // This will work fine
//        Result.iterateAndDivide(arr, 2, 20, 1); // This will also work fine
//        Result.iterateAndDivide(arr, 10, 2, 0); // This will throw ArithmeticException
//        Result.iterateAndDivide(arr, 10, -1, -2); // This will throw ArrayIndexOutOfBoundsException
//    }
//}