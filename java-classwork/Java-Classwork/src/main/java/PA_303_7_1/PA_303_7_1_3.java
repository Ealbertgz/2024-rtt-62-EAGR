package PA_303_7_1;

import java.util.Arrays;

public class PA_303_7_1_3 {
    public static void main(String[] args){
        String[] myStringArray= {"red","green","blue","yellow"};
        System.out.println(myStringArray.length);
        String[] myStringTargetArray= myStringArray.clone();

        System.out.println("Source Array: " + Arrays.toString(myStringArray));
        System.out.println("Target Array: " + Arrays.toString(myStringTargetArray));



    }
}
