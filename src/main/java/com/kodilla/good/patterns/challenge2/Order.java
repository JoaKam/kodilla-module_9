package com.kodilla.good.patterns.challenge2;

import java.time.LocalDate;

public class Order {

    private Buyer buyer;
    private Product product;
    private int quantity;
    private LocalDate date;

    public Order(final Buyer buyer, final Product product, final int quantity, final LocalDate date) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
