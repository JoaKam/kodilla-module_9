package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public interface Seller {

    HashMap<String, Product> generateProductsMap();

    void process(Product orderedProduct, int productQuantity);

}
