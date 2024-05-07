package PA_303_7_1;

public class PA_303_7_1_5 {
    public static void main(String[] args) {
        int [] myArray = new int[5];

        for(int i=0; i <myArray.length; i++){
            myArray[i] = i;
        }

        for( int i=0; i< myArray.length; i++){
            System.out.println("element is at index " + i + " : " + myArray[i]);
        }
    }
}
