package PA_303_7_1;

public class PA_303_7_1_6 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}