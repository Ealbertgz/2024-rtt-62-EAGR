package PA_303_7_1;

import java.util.Arrays;

public class PA_303_7_1_9 {
    public static void main(String[] args) {
        int mynumbers[] = {4,2,9,13,1,0};

        Arrays.sort(mynumbers);

        System.out.println("Numbers sorted in ascending order: ");
        for (int mynumber: mynumbers) {
            System.out.println(mynumber + " ");
        }


    }
}
