////1 prompt user for a string
////2 prompt for the length of the substrings to find
////3 scan the string a create a substring of 'n' size
////4 print this substring
////5 rearrange it lexicographically from smallest to largest
//
//
//
//package PA_303_3_1;
//
//import java.util.Arrays;
//import java.util.Scanner;
////
//public class Homework_303_3_1_3 {
//    public static void main(String[] args) {
////        // Step 1: Prompt the user for a string
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
////
////        // Step 2: Prompt for the length of the substrings to find
//        System.out.print("Enter the length of the substrings to find: ");
//        int substringLength = scanner.nextInt();
//        scanner.nextLine(); // Consume newline left-over
////
////        // Step 3: Scan the string and create a substring of 'n' size
////        // Assuming the user wants to find all substrings of the specified length
//        for (int i = 0; i <= inputString.length() - substringLength; i++) {
//            String currentSubstring = inputString.substring(i, i + substringLength);
////
////            // Step 4: Print this substring and rearrange it lexicographically from smallest to largest
//            char[] chars = currentSubstring.toCharArray();
//            Arrays.sort(chars); // Sort the characters
//            String sortedSubstring = new String(chars);
//
//            System.out.println(sortedSubstring);
//        }
//
//        scanner.close();
//    }
//}
////
