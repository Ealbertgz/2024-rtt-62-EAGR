package coffeeshop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Declares two private fields:
    //
    //    coffeeShop of type CoffeeShop, which will hold the instance of the coffee shop being managed.
    //    scanner of type Scanner, initialized with System.in to read user input from the console.

    private CoffeeShop coffeeShop;
    private Scanner scanner = new Scanner(System.in);


    //Declares a public method printMenu() that returns an integer.
    // This method prints the menu options to the console and reads the user's choice.
    //Prints the menu options to the console. Users can choose to exit, print the list of products,
    // order a product, or checkout.
    public int printMenu() {
        System.out.println("\n\n0) Exit");
        System.out.println("1) Print the list of products");
        System.out.println("2) Order a product");
        System.out.println("3) Checkout");

        //Prompts the user to enter their choice and reads the input using scanner.nextInt(),
        // storing the choice in the variable option.

        System.out.print("Enter your choice ");
        int option = scanner.nextInt();

        return option;
    }

    //Declares a public method runCoffeeShop() with no return type.
    // This method orchestrates the main flow of the application.


    public void runCoffeeShop() {
        //Initializes a new CoffeeShop object, initializes its products, and prints the initial list of products.
        coffeeShop = new CoffeeShop();
        coffeeShop.initProducts();
        coffeeShop.printProducts();

        //Starts an infinite loop to continuously present the menu and process user choices.
        while(true) {
            //Resets a flag value to true and calls printMenu() to display the menu and get the user's choice.
            boolean value = true;
            int option = printMenu();

            //Checks the user's choice:
            //
            //    If 0 is chosen, exits the application.
            //    If 1 is chosen, prints the list of products again.

            if ( option == 0 ) {
                System.exit(0);
            } else if ( option == 1 ) {
                coffeeShop.printProducts();
            }
        }
        //Closes the while loop and the runCoffeeShop() method.
    }

    // we only have 1 public static void main for the whole coffee shop project
    // this will be the way the program starts up
    public static void main(String[] args) {
        Main main = new Main();
        main.runCoffeeShop();
    }

}

//Declares the main method, which is the entry point of the application.
// It creates an instance of Main and calls runCoffeeShop() to start the application.

//This class serves as the control center of the coffee shop simulation,
// managing the flow of the application, presenting the menu to the user,
// and processing user choices to perform actions like printing the list of products or exiting the application.
