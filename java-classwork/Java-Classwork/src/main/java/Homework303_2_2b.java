import java.util.Scanner;

public class Homework303_2_2b {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter number:");
            int i = scan.nextInt();
            System.out.println("Int: " + i);

            System.out.println("Enter double:");
            Double d = scan.nextDouble();
            System.out.println("Double: " + d);

            System.out.println("Enter string:");
            scan.nextLine();
            String s = scan.nextLine();
            System.out.println("String: " + s);

            scan.close();
        }
    }

