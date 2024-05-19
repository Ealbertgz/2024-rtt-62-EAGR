package coffeeshop;

//Declares a public class named Product.
public class Product {

    //Defines four private member variables:
    private double price;
    private String name;
    private boolean beverage;
    private int quantityAvailable;


//Implements a default constructor (no-argument constructor).
// When a Product object is created without specifying any parameters,
// this constructor is called. It also prints a message to the console indicating
// that the no-args constructor was invoked.

    // constructor with no args - by default this is included with the java language
    public Product() {
        System.out.println("No args constructor called");
    }

    // constructor with all args
    // it is only if you want to have a custom constructor that you add it
    public Product(double price, String name, boolean beverage, int quantityAvailable) {
        this.price = price;
        this.name = name;
        this.beverage = beverage;
        this.quantityAvailable = quantityAvailable;
    }

    //Implements a parameterized constructor that accepts four arguments corresponding
    // to the product's price, name, whether it's a beverage, and its quantity available.
    // This constructor initializes a Product object with the provided values.


    //Getter method for the price attribute, returning its current value.
    public double getPrice() {
        return price;
    }

    //Setter method for the price attribute, allowing its value to be changed.
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeverage() {
        return beverage;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    //Overrides the toString method from the Object class to provide a custom string representation
    // of a Product object. This method concatenates the names and values of all the attributes into a string,
    // making it easier to display or log a Product object.

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", beverage=" + beverage +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}