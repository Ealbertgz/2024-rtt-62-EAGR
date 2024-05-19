package coffeeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class CoffeeShop {

    //Declares a private field products of type List<Product> and initializes it as an ArrayList.
    private List<Product> products = new ArrayList<>();

    // building the menu of products for sale at the coffee shop
    //Declares a public method initProducts() with no return type.
    public void initProducts() {
        ProductReader pr = new ProductReader();
        List<Product> productsFromFile = pr.readProducts();
        products.addAll(productsFromFile);

        // Creates an instance of ProductReader and calls its readProducts() method to
        // get a list of products from a file.
        // Adds all products from the file to the products list.


        //Manually creates a Product object for a small coffee, sets its properties, and adds it to the products list.

        Product p1 = new Product();
        p1.setPrice(5.46);
        p1.setName("Small Coffee");
        p1.setBeverage(true);
        products.add(p1);

        //creates a Product object for a large coffee and adds it to the list.
        Product largeCoffee = new Product();
        largeCoffee.setPrice(9.46);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setBeverage(true);
        products.add(largeCoffee);

        Product cakePop = new Product();
        cakePop.setPrice(4.89);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false, 50);
        products.add(eggSandwich);


    }

//    public void printCheapProducts(){
//        List<Product> cheapProducts = products.stream().filter(product -> product.getPrice() < 5 ).collect(collect(Collectors.toList*());
//
//        //this code prints each of the products that is less than $5
//        cheap.Products.forEach(product - > System.out.println(product.getName() + "\t" + product getPrice));

    // the same 2 lines of code written as a for loop
//    for(
//    Product product:products)
//
//    {
//        if (product.getPrice() < 5) {
//            System.out.println(product.getName() + "\t" + product.getPrice)
//        }
//    }
//}
    //Declares a public method printProducts() with no return type.
    // print the list of products available for sale
    public void printProducts() {
        for ( int pos = 0 ; pos < products.size() ; pos++ ) {
            Product product = products.get(pos);
            System.out.println((pos+1) + ") " + product.getName() + "\t" + product.getPrice() );
            //Iterates over the products list, retrieves each Product object, and prints its name and price.

        }
    }
}