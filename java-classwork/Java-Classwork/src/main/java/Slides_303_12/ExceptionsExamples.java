package Slides_303_12;

public class ExceptionsExamples {
    public static void main(String[] args) {
        int [] array = new int[10];

        try {
            System.out.println("Before error");
            //when  the exception occurs on this line it will automatically jump to the catch block

            array [11] = 5;


            //any code after the exception will not get run
            System.out.println("After error");

        } catch (Exception e) {
            System.out.println("Caught the exception e with message :" + e.getMessage());
        }
    }
}
