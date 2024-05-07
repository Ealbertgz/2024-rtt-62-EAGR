package Slides_303_6;

public class ArraysExample {
    public static void main(String[] args) {
        double[] dArray = new double[10];

        // this is also a valid way of creating a new array , note that
        //it is 2 lines. First create the variable, 2nd creates the new array in memory
        int[] iArray;
        iArray = new int[20];

        // this gets used a bit from time to time
//        the compiles will see this and create an array of string with size of 3 and puts the
//   3 values in the array
        String[] constants = {"String1", " String2", "String3"};

        // new style for loop can be used with arrays
        for (String constant: constants) {
            System.out.println(constant);

        }

        // this is the same as doing
        String[] c1 = new String[3];
        c1[0] = " String1";
        c1[1] = "String2";
        c1[2] = "String3";

            // this also works for other data types
        int[] intConstants = {1,2,3,4,5};
        for ( int pos = 0; pos < intConstants.length ; pos++) {
            System.out.println(intConstants[pos]);
        }

        // getting the lenght for an array is simply using .lenght
        int x = intConstants.length;


        String[] sArray = new String[10];

        String s = new String("New String");
        s.length(); // this will give us the size of the string

        sArray[0] = s;

        // this is 99% of what you will use in the future
//        List<Double> dList = new ArrayList<>();
//        dSlist.size();   -- notice how for a list, you use the word size
    }
}
