package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.List;
import java.util.Scanner;


public class ProductMain {
    private ProductDAO productDAO = new productDAO();
    Scanner scanner = new Scanner(System.in);

    public void run() {
    String productName = inputProductSearch();

    List<Product> products = productDAO.findLikeName(productName);
    }
    public String inputProductSearch(){
        System.out.println("Enter a product to search for: ");
        String productName = scanner.nextLine();
        return productName;

        public static void main(String[] args) {
            ProductMain pm = new ProductMain();
            pm.run();
        }


    }
}
