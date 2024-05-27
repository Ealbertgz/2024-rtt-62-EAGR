package SBA2Q3;

import java.text.DecimalFormat;
import java.util.ArrayList;

//Implementing an interface means the class agrees to adhere to the contract
// defined by the interface, which includes providing implementations for all
// abstract methods declared in the interface.

public class Cricket implements Sport{

    //an array starts with pos 0 - this is called 0 based

    //declares a private instance variable named playerIDs,
    // which is an array of integers. The private access modifier ensures
    // that this variable can only be accessed within the Cricket class itself.

    private int[] playerIDs;

    //The constructor for the Cricket class initializes the playerIDs array with a size of 12,
    // indicating that the team consists of 12 players.
    // It then iterates over the array starting from index 1 (since arrays in Java are
    // zero-indexed), setting each element to 1. This could imply that each player is
    // initially given an ID of 1, although the loop starts from position 1 instead of 0,
    // which is unusual because array indices start at 0 in Java. This might be a mistake
    // or a design choice depending on how IDs are intended to be used or interpreted in
    // the broader context of the application.

    public Cricket() {
        playerIDs = new int[12];
        for(int pos = 1; pos < playerIDs.length; pos++) {
            playerIDs[pos] = 1;
        }
        System.out.println("A new cricket team has been formed");

    }


    //This method calculates and prints the average age of the cricket team members. It operates on an array of integers (int[] age), where each integer represents the age of a team member. The method follows these steps:
    //
    //    Sum of Ages Calculation: Initializes a double variable sum to 0. It then iterates over the age array using a for-each loop, adding each age value to sum. This accumulates the total age of all team members.
    //
    //    Average Age Calculation: Divides the total sum of ages by the number of team members (age.length) to compute the average age. This operation assumes that the age array contains valid positive integers.
    //
    //    Formatting and Printing: Creates a DecimalFormat object with a pattern "0.00" to format the average age to two decimal places. It then prints the average age along with a descriptive message to the console.

    @Override
    public void calculateAvgAge(int[] age) {

        double sum = 0;
        for (int a : age) {
            sum = sum + a;
        }

        double avgAge = sum / age.length;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The average age of the team is " + df.format(avgAge));

    }


    //This method marks a player as retired by updating their ID in the playerIDs array. It takes an integer parameter id, which represents the ID of the player to be marked as retired. The method proceeds as follows:
    //
    //    Check Retirement Status: Checks if the player with the given id is already marked as retired by looking at the corresponding entry in the playerIDs array. If the player's ID is -1, it indicates that the player is already retired.
    //
    //    Update Retirement Status: If the player is not already retired, it sets their ID in the playerIDs array to -1, marking them as retired. This effectively removes the player from active participation in the team.
    //
    //    Confirmation Message: Prints a confirmation message to the console indicating that the player has been marked as retired.

    @Override
    public void retirePlayer(int id) {


        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has already retired");
        }



    }

    public static void main(String[] args) {

        Cricket c = new Cricket();

        int[] ages = {1, 4};
        c.calculateAvgAge(ages);

        c.retirePlayer(3);
        c.retirePlayer(3);

    }
}
