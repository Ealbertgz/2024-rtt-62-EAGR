package PA_303_12_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling1 {
    public static void main(String[] args) throws InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.println("Enter the divisor: ");
            int divisor = scanner.nextInt();
            scanner.close();

            if (divisor == 0) {
                throw new ArithmeticException("java.lang.ArithmeticException: / by zero");
            }

            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }

    }
}