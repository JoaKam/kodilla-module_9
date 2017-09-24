package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public interface Seller {

    HashMap<String, Product> generateProductsMap();

    default boolean validateOrder(Product orderedProduct) {

        if (orderedProduct == null) {
            return false;
        } else {
            return true;
        }
    }

    void process(Product orderedProduct, int productQuantity);

}
