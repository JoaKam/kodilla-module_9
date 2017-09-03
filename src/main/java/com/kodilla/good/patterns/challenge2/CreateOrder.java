package com.kodilla.good.patterns.challenge2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class CreateOrder {

    public String getProductName() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a product:");
        final String product = keyboard.nextLine();
        return product;
    }

    public Product getProduct() {

        String product = getProductName();
        Product thisProduct;
        HashMap<String, Product> productsMap = Product.generateProductsMap();

        thisProduct = productsMap.get(product);

        if (thisProduct == null) {
            System.out.println("Product unavailable");
            System.exit(0);
        }

        if (thisProduct.getQuantity() == 0) {
            System.out.println("Product temporarily out-of-stock");
            System.exit(0);
        }

        System.out.println("Product available");
        System.out.println(thisProduct);
        return thisProduct;

    }

    public int getQuantity(Product thisProduct) {
        Scanner keyboard = new Scanner(System.in);
        final int productAvailableQuantity = thisProduct.getQuantity();

        System.out.println("Enter the quantity of products to order:");
        int orderQuantity = keyboard.nextInt();

        if (orderQuantity > productAvailableQuantity) {
            System.out.println("Selected quantity unavailable. Please, select the number not greater than " + productAvailableQuantity + " or type 0 to exit an order.");
            orderQuantity = keyboard.nextInt();

            if (orderQuantity == 0) {
                System.out.println("Order cancelled");
                System.exit(0);
            }

            if (orderQuantity > productAvailableQuantity) {
                System.out.println("Selected quantity unavailable. Order cancelled.");
                System.exit(0);
            }
        }

        return orderQuantity;
    }

    public Order createOrder(Buyer buyer) {

        Product orderedProduct = getProduct();
        int productQuantity = getQuantity(orderedProduct);
        LocalDate date = LocalDate.now();

        Order createdOrder = new Order(buyer, orderedProduct, productQuantity, date);
        System.out.println("New order: ");
        System.out.println(createdOrder);

        return createdOrder;

    }
}