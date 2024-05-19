package org.example;

public class SBA1Practice {
    public static void main(String[] args) {
//        if you want to convert to string - if it comes as an int
// Integer y = x;
//        y.toString();
//

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //part 1  - create a for loop to print each character of the string s on its own line
        //You can use the s.charAt(pos) function
/*
A
B
C
D
E
F
G
....
 */

        for (int i = 0; i < s.length(); i++) {
            ;
            System.out.println(s.charAt(i) + " ");
        }


        // given the following strings convert them to integer values
        // Integer.valueOf()

        String ten = "10";
        String hundred = "100";

        Integer i = Integer.valueOf(ten);
        Integer z = Integer.valueOf(hundred);
        System.out.println(i);
        System.out.println(z);

        //part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int r;

        int sumArray = 0;
        for (r = 0; r < array.length; r++) {
            sumArray = sumArray + array[r];


        }
        System.out.println(" The sum of all numbers is: = " + sumArray);
        //part 4

        // given the array of strings convert them to numbers and print the sum
    String[] nums= {"2", "4", "5", "6","7", "8", "10"};


        int sum1 = 0;
        for (String string : nums) {
            int value = Integer.valueOf(string);
            sum1 = sum1 + value;
        }
        System.out.println(sum1);

//    int sum1=0;
//        int z2;
//        int value = Integer.valueOf(nums);
//        for (int z2=0; z2< nums.length  ;z2++){
//            sum1 =sum1 +value;
//        }
//        System.out.println(sum1);
//
//}


    }

}

//for (int pos = 0; pos <s.length() ; pos++){
//    System.out.println(s.charAt(pos));

// int ten1= Integer.valueOf(ten);
// int hun = Integer.valueOf(hundred);

// int sum=0
// for( int pos = 0; pos < array.length;  pos++){
// sum = sum + array[pos];
// }
//System.out.println(sum);


//int sum1 = 0
//for (String string: nums) {
// int value = Integer.valueOf(string);
//sum1 = sum1 + value;
//}
//System.out.println(sum1);
//}