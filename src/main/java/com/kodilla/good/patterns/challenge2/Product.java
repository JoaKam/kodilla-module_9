package com.kodilla.good.patterns.challenge2;

import java.util.HashMap;

public class Product {

    String name;
    String description;
    int price;
    int quantity;

    public Product(final String name, final String description, final int price, final int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static HashMap<String, Product> generateProductsMap() {

        HashMap<String, Product> productsMap = new HashMap<>();

        productsMap.put("Mazda RX-8", new Product("Mazda RX-8", "sports car that was manufactured by Mazda", 40000, 1));
        productsMap.put("The Witcher 3: Wild Hunt", new Product("The Witcher 3: Wild Hunt", "2015 action role-playing video game developed by CD Projekt RED and published b0y CD Projekt", 100, 20));
        productsMap.put("Chanel No. 5", new Product("Chanel No. 5", "first perfume launched by French couturier Gabrielle Coco Chanel", 300, 50));
        productsMap.put("So Kate nude 38", new Product("So Kate nude 38", "Christian Louboutin's 'So Kate' pumps are crafted from black leather with the brand's signature red sole", 5000, 0));

        return productsMap;
    }
}
