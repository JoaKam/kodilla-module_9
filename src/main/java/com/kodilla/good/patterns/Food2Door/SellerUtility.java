package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class SellerUtility {

    public static HashMap<String, Product> generateProductsMapEFS() {

        HashMap<String, Product> productsMap = new HashMap<>();

        productsMap.put("apple", new Product("apple", 1, 0));
        productsMap.put("banana", new Product("banana", 2, 6));
        productsMap.put("orange", new Product("orange", 2, 7));
        productsMap.put("pineapple", new Product("pineapple", 3, 8));

        return productsMap;
    }

    public static HashMap<String, Product> generateProductsMapGFS() {

        HashMap<String, Product> productsMap = new HashMap<>();

        productsMap.put("apple", new Product("apple", 2, 9));
        productsMap.put("banana", new Product("banana", 3, 8));
        productsMap.put("milk", new Product("orange", 1, 7));
        productsMap.put("bread", new Product("pineapple", 2, 6));

        return productsMap;
    }

    public static HashMap<String, Product> generateProductsMapHS() {

        HashMap<String, Product> productsMap = new HashMap<>();

        productsMap.put("apple", new Product("apple", 8, 1));
        productsMap.put("banana", new Product("banana", 7, 2));
        productsMap.put("corn", new Product("orange", 6, 7));
        productsMap.put("coca-cola", new Product("pineapple", 10, 8));

        return productsMap;
    }

}
