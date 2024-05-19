package coffeeshop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {

    //This method initializes an empty list of Product objects.
        public List<Product> readProducts() {
        List<Product> products = new ArrayList<>();

            //It attempts to open and read from a file named products.csv.
            //A BufferedReader is used to efficiently read the file line by line.
        try {
            File file = new File("products.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            String header = bufferedReader.readLine();
//            String product = bufferedReader.readLine();
//
//            System.out.println(header);
//            System.out.println(product);
//
//            Product p = parseProduct(product);

            // this will consume the header because it is the first read in the file


            String line = bufferedReader.readLine();

            //The next line is read and parsed into a Product object using the parseProduct(String) method.
            // this will read the first product
            line = bufferedReader.readLine();
            while( line != null ) {
                Product p = parseProduct(line);
                products.add(p);
                line = bufferedReader.readLine();
            }

//            System.out.println("We read in " + products.size() + " products.");
//            for ( Product p  : products ) {
//                System.out.println(p);
//            }

            //If an exception occurs during file reading, it is caught and printed to the standard error stream.
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        //Finally, the list of Product objects is returned.
        return products;
    }

    //This private helper method takes a line of text (a string) as input, which should represent a product in CSV format.
    //The line is split into an array of strings based on commas.
        private Product parseProduct(String line) {
        //     0     , 1  , 2, 3
        // Chai Latte,2.99,10,true
        Product result = new Product();
    //A new Product object is created and populated with this information, then returned.

        String[] column = line.split(",");
        result.setName(column[0]);

        double price = Double.parseDouble(column[1]);
        result.setPrice(price);

        int quantity = Integer.parseInt(column[2]);
        result.setQuantityAvailable(quantity);

        boolean beverage = Boolean.parseBoolean(column[3]);
        result.setBeverage(beverage);

        return result;
    }


    //This static method serves as the entry point for testing purposes.
    // It creates an instance of ProductReader and calls readProducts()
    // to demonstrate the functionality of reading and parsing products from a file.

    public static void main(String[] args) {
        ProductReader pr = new ProductReader();
        pr.readProducts();
    }

}