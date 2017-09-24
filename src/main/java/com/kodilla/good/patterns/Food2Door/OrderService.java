package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Scanner;

public class OrderService {

    public static Seller SelectSeller() {

        int sellerNumber = 4;

        while (sellerNumber > 3) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select the seller:\n [1] ExtraFoodShop \n [2] GlutenFreeShop \n [3] HealthyShop \n [0] EXIT");
            sellerNumber = keyboard.nextInt();
        }

        switch (sellerNumber) {

            case 1:
                return new ExtraFoodShop();
            case 2:
                return new GlutenFreeShop();
            case 3:
                return new HealthyShop();
            default:
                System.out.println("The order has been cancelled.");
                System.exit(0);
                break;
        }

    }

    public static String provideProductName() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a product:");
        final String product = keyboard.nextLine();
        return product;
    }

    public static Product provideProduct(HashMap<String, Product> productsMap) {

        String productName = provideProductName();
        Product product;

        product = productsMap.get(productName);

        if (product == null) {
            System.out.println("Product unavailable");
            return null;
        }

        if (product.getQuantity() == 0) {
            System.out.println("Product temporarily out-of-stock");
            return null;
        }

        System.out.println("Product available");
        System.out.println(product);
        return product;

    }

    public static Integer provideQuantity(Product product) {
        Scanner keyboard = new Scanner(System.in);
        final int productAvailableQuantity = product.getQuantity();

        System.out.println("Enter the quantity of products to order:");
        int orderQuantity = keyboard.nextInt();

        while (orderQuantity > productAvailableQuantity) {
            System.out.println("Selected quantity unavailable. Please, select the number not greater than " + productAvailableQuantity + " or type 0 to exit an order.");
            orderQuantity = keyboard.nextInt();

            if (orderQuantity == 0) {
                System.out.println("The order has been cancelled.");
                System.exit(0);
            }

        }

        return orderQuantity;
    }
}