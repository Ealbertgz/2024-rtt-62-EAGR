package SBA2Q3;
import java.text.DecimalFormat;

//Indicates that the Football class will implement the Sport interface, meaning it must provide implementations
// for all abstract methods declared in the Sport interface.
public class Football implements Sport{


    private int[] playerIDs;

//Defines the default constructor for the Football class.
    //Initializes the playerIDs array with a size of 12.
    // This suggests that the team consists of 12 players initially.

    public Football() {
        playerIDs = new int[12];

        //The for loop iterates over the playerIDs array starting
        // from index 1 (since arrays in Java are zero-indexed,
        // but here we start from 1 based on the context provided).
        // It sets each element to 1, likely representing active players.
        // The first element (at index 0) is implicitly set to 0 by default
        // and seems to be reserved or unused.

        for (int pos = 1; pos < playerIDs.length; pos++) {
            playerIDs[pos] = 1;
        }
        System.out.println("A new football team has been formed");
    }


//    Purpose: This method calculates and prints the average age of the team members whose ages are passed in as an
//    array.
//    Implementation:
//    It initializes a double variable sum to accumulate the total age of the team members.
//    Uses a for-each loop to iterate over each age in the age array, adding each age to sum.
//    After accumulating the total age, it calculates the average age by dividing the total age (sum) by the number of team members (age.length).
//    Utilizes DecimalFormat to format the average age to two decimal places for better
//    readability.
//    Finally, it prints the calculated average age to the console.

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


//    Purpose: This method marks a player as retired by updating their ID in the playerIDs array to -1.
//    Implementation:
//    Checks if the player with the given id is already retired by comparing their ID in the playerIDs array to -1.
//    If the player is already retired, it prints a message stating so.
//    If the player is not retired, it updates their ID in the playerIDs array to -1, marking them as retired, and prints a confirmation message.

    @Override
    public void retirePlayer(int id) {

        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has already retired");
        }

    }


//    Check for Retirement Status: The method first checks if the player identified by id is already retired by examining the playerIDs array. If the player's ID is -1, it implies they have retired, and the method prints a message stating that the player cannot be transferred because they are already retired.
//    Transfer Logic: If the player is not retired (i.e., their ID in the playerIDs array is not -1), the method proceeds to simulate the transfer process. However, the actual action of retiring the player (marking them as -1 in the playerIDs array) is commented out. This suggests that the intention was to retire the player upon transfer, but the implementation is incomplete or intentionally omitted.
//    Feedback Message: Regardless of the outcome, the method prints a message indicating that the player has been transferred, including the transfer fee. This provides feedback to the user about the operation's success or failure.

    public void playerTransfer(int fee, int id) {

        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired");
        } else {
            //if this isn't working on the SBA, then try adding this back
//            playerIDs[id] = -1;
            System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
        }
    }
}