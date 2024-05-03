package PA_303_2_1;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables, assigns an integer to each,
        // and adds them together. Assign the sum to a variable. Print out the result.//


        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum is " + sum);

        //Write a program that declares two double variables, assigns a number to each,
        // and adds them together. Assign the sum to a variable. Print out the result.

        double d1 = 10.5d;
        double d2 = 20.5d;
        double dSum = d1 + d2;
        System.out.println(dSum);

        //Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int x = 30;
        double y = 50.55;
        double sum3 = x + y;
        System.out.println(sum3);

        //Write a program that declares two integer variables,
        // assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result.
        // Now change the larger number to a decimal. What happens? What corrections are needed?

        int v1 = 5;
        int v2 = 2;

        double div = (double) v1 / (double) v2;
        System.out.println("!!!!!! " + v1 + "/ " + v2 + " = " +div);

        //Write a program that declares two double variables,
        // assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result. Now, cast the result to an integer.
        // Print out the result again.

        double d3 = 7.1d;
        double d4 = 8.4d;

        if (d3 > d4) {
            double d5 = d3 / d4;
            System.out.println(d5);
        } else {
            double d5 = d4 / d3;
            System.out.println(d5);

        }

  //      int newInt = (int) d5;
 //       System.out.println(newInt);

       // int i=(int)d5;
        //System.out.println(d5);




        //Write a program that declares two integer variables,
        // x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.

        int r = 5;
        int z = 6;
        int q = z/r;
        System.out.println(q);
        double doubleResult = (double) q;
        System.out.println(doubleResult);


        //Write a program that declares a named constant and uses it in a calculation. Print the result.

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product.
        // Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal
        // to obtain the totalSale amount. Be sure to format the results to two decimal places.

        String product1 = "coffee";
        String product2 = "cappucino";
        String product3 = "espresso";
        Double product1Price = 4d;
        Double product2Price = 2d;
        Double product3Price = 3d;
        Double Subtotal = product1Price * 3 + product2Price * 4 + product3Price * 2;
        Double SALES_TAX = .08;
        Double totalSale = Subtotal * SALES_TAX;
        System.out.println("your total sale is = " + totalSale);

//String formattedSale = String.format("%.2f", totalSale)
//System.out.println("| TOTAL SALE          " + formattedSale + "  |");//

//

       // double coffee = 2.50;
      // double cappuccino = 3.50;
       //double espresso = 4.50;

      // double subtotal = (coffee * 3) + (capuccino * 4) + (espresso * 2);

       // double salesTaxAmount = subtotal * SALES_TAX
        //double totalAmount = subtotal + salesTaxAmount;

        //DecimalFormat df = new DecimalFormat ( "0.00")'
       // System.out.println("Subtotal :")


    }
}
