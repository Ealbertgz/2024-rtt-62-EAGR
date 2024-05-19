
//The provided code snippet defines a class named Result with a single static method getDigitsSum. This method calculates the sum of the digits of a given integer number. Here's a step-by-step explanation of how it works:
//
//Method Signature: The method getDigitsSum is declared as public static, meaning it belongs to the Result class and can be called without creating an instance of the class. It takes one parameter, an integer (int Number), and returns an integer (int).
//
//Conversion to String: Inside the method, the input integer Number is converted to a string using Integer.toString(Number). This conversion is necessary because Java does not provide direct methods to iterate over the digits of an integer. By converting the integer to a string, we can easily iterate over each character (digit) of the number.
//
//Initialization of Sum: An integer variable sum is initialized to 0. This variable will accumulate the sum of the digits as we iterate through them.
//
//Iteration Over Digits: A for-each loop is used to iterate over each character in the string representation of the number. The toCharArray() method converts the string into an array of characters, allowing us to access each digit individually. Inside the loop, Character.getNumericValue(digit) is used to convert each character (digit) back to its numeric value. This is necessary because the digits are now stored as characters, not integers.
//
//Accumulating the Sum: For each digit, its numeric value is added to the current sum. This is done using the += operator, which adds the right operand to the left operand and assigns the result to the left operand.
//
//Return Value: After iterating through all the digits and accumulating their sum, the method returns the total sum.
//



package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static int getDigitsSum(int Number){
    String numberString = Integer.toString(Number);
    int sum = 0;

    for (char digit : numberString.toCharArray()){
        sum = sum +Character.getNumericValue(digit);
    }
    return sum;

    /*
     * Complete the 'getDigitsSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER largeNumber as parameter.
     */


    }

}

public class Testingmaterial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int largeNumber = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getDigitsSum(largeNumber);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

