package com.kodilla.good.patterns.challenge2;

public class App {
    public static void main(String[] args) {

        LogIn log = new LogIn();
        CreateOrder newOrder = new CreateOrder();

        Buyer thisBuyer = log.returnBuyer();
        Order thisOrder = newOrder.createOrder(thisBuyer);
        OrderConfirmation newConfirmation = new OrderConfirmation(thisOrder);
        newConfirmation.confirmOrder();
    }
}
