package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.HashMap;

public class GlutenFreeShop implements Seller {

    public HashMap<String, Product> generateProductsMap() {
        return SellerUtility.generateProductsMapGFS();
    }

    public void process(Product orderedProduct, int productQuantity) {
        System.out.println("\n \n \n");
        System.out.println("SMS to: 111 111 111");
        System.out.println("SMS from: GlutenFreeShop 222 222 22");
        System.out.println("We would like to confirm your order: " + orderedProduct.getName() +", quantity: " + orderedProduct.getQuantity());
        System.out.println("Estimated delivery date: " + LocalDate.now().plusDays(14) + "\n");
        System.out.println("Order will be delivered by DHL");
    }
}
