package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.HashMap;

public class ExtraFoodShop implements Seller {

    public HashMap<String, Product> generateProductsMap() {
        return SellerUtility.generateProductsMapEFS();
    }

    public void process(Product orderedProduct, int productQuantity) {
        System.out.println("\n \n \n");
        System.out.println("Mail to: buyer@costam.pl");
        System.out.println("Mail from: ExtraFoodShop@costam.pl");
        System.out.println("Subject: Order confirmation \n" );
        System.out.println("Hello ");
        System.out.println("We would like to confirm your order: " + orderedProduct.getName() +", quantity: " + orderedProduct.getQuantity());
        System.out.println("Estimated delivery date: " + LocalDate.now().plusDays(7) + "\n");
        System.out.println("Order will be delivered by UPS");
        System.out.println("Thank you for using our shop. \n Joanna Allegro" );
    }
}
