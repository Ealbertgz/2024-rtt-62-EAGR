package SBA2Q1;
import java.util.ArrayList;

//The provided code snippet defines a portion of a Java class named ArrayToList.
// This class is designed to work with an ArrayList of String objects,
// specifically demonstrating how to convert an array of strings into an ArrayList.

//Declares a private member variable named arrayToList of type ArrayList<String>.
//Initializes arrayToList with an empty ArrayList. This means that when an instance of ArrayToList is created,
// arrayToList is ready to hold strings, but initially, it's empty.

public class ArrayToList {
    private ArrayList<String> arrayToList = new ArrayList<>();

//    Defines a public constructor for the ArrayToList class. This constructor is empty,
//    meaning it doesn't perform any actions when an instance of ArrayToList is created.
//    Its presence allows for the creation of ArrayToList objects without needing to pass parameters.
    public ArrayToList(){}


    //    Declares a public method named convert that takes a single parameter: an array of strings (String[] a).
//    The purpose of this method is to populate the arrayToList with the contents of the passed array a.
//    Inside the method, a for loop iterates over each element in the array a. For each iteration, it adds
//    the current element (a[pos]) to the arrayToList using the add method.
//    This process continues until every element in the array a has been added to arrayToList,
//    effectively converting the array into an ArrayList.

    public void convert(String[] a) {
        for(int pos = 0; pos < a.length; pos++){
            arrayToList.add(a[pos]);
        }
    }


    //    Purpose: Replaces the string at a specified index (idx) in arrayToList with an empty string.
//    How It Works:
//    Retrieves the current string at the specified index (idx) from arrayToList using the get method.
//    Uses the set method to replace the string at the specified index with an empty string ("").
//    This effectively modifies the ArrayList by changing the content of the element at the given index to an empty string.

    public void replace(int idx){
        String value = arrayToList.get(idx);
        arrayToList.set(idx,"");
    }


//Purpose: Creates a new ArrayList<String> (result) that includes only non-empty strings from arrayToList.
//How It Works:
//
//    Initializes a new ArrayList<String> named result.
//    Iterates over each element in arrayToList using a for-each loop.
//    Checks if the current element (s) is not an empty string using the equals("") method.
//    If the element is not empty, it adds the element to result using the add method.
//    Once all elements in arrayToList have been checked, result contains only the non-empty strings from arrayToList.
//    Returns result, providing a filtered view of arrayToList that excludes empty strings
    public ArrayList<String> compact() {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arrayToList) {
            if (!s.equals("")) {
                result.add(s);
            }
        }
        return result;
    }


    //nstantiates a new object of the ArrayToList class. This object,
    // named arrayToList, is used throughout the rest of the main method to perform operations on an ArrayList<String>.
    public static void main(String[] args) {
        ArrayToList arrayToList = new ArrayToList();

        //        Declares and initializes a string array named strArray with five elements.

                String[] strArray = {"one", "two", "three", "four", "five"};
//        Calls the convert method on the arrayToList object, passing strArray as an argument.
//        This method converts the array of strings into an ArrayList<String> stored in arrayToList.

                arrayToList.convert(strArray);

                //Calls the replace method on the arrayToList object, passing 1 as an argument.
        // This method replaces the string at index 1 (the second element, since indexing starts
        // at 0) in the ArrayList with an empty string.

        arrayToList.replace(1);
        arrayToList.replace(2);

        //Calls the compact method on the arrayToList object, which creates a new ArrayList<String>
        // named compacted. This new ArrayList contains only the non-empty strings from arrayToList,
        // excluding any strings that were replaced with empty strings in the previous steps.
        ArrayList<String> compacted = arrayToList.compact();

        //        Iterates over each string in the compacted ArrayList using a for-each loop.
//                Prints each string to the console. This step demonstrates how to traverse and display the contents of an ArrayList<String>.

        for (String c : compacted) {
            System.out.println(c);
        }
    }
}