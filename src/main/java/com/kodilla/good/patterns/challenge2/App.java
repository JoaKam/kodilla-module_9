package com.kodilla.good.patterns.challenge2;

public class App {
    public static void main(String[] args) {

        LogIn log = new LogIn();
        OrderService newOrder = new OrderService();

        OrderProcessor newOrderProcessor = new OrderProcessor(log, newOrder);
        newOrderProcessor.process();
    }
}
