package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        Seller seller = OrderService.selectSeller();

        HashMap<String, Product> sellerProductsMap = seller.generateProductsMap();
        Product selectedProduct = OrderService.provideProduct(sellerProductsMap);

        try {
            Integer selectedQuantity = OrderService.provideQuantity(selectedProduct);
            seller.process(selectedProduct, selectedQuantity);
            System.out.println("The order has been successfully completed.");
        } catch (NullPointerException e) {
            System.out.println("The order has been cancelled.");
        }

    }
}

