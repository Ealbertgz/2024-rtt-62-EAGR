package PA_303_7_1;

public class PA_303_7_1_10 {
    public static void main(String[] args) {

        Object[] mixedArray = new Object[] {761, " string1", "string2", "string3", 5.97};

        for (Object element : mixedArray){
            System.out.println(element);
        }
    }
}
