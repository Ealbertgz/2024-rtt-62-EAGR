package practice_examples;

public class reverseorder {
    public static void main(String[] args){
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        System.out.println("Original Array: ");
        for(int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array: ");
        for(int i=intArray.length-1;i>=0;i--){
            System.out.print(intArray[i]+" ");
        }
    }
}
