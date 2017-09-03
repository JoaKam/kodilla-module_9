package com.kodilla.good.patterns.challenge2;

public class OrderConfirmation {

    Order order;

    public OrderConfirmation(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void confirmOrder(){

        System.out.println("\n \n \n");
        System.out.println("Mail to: " + getOrder().getBuyer().getEmail());
        System.out.println("Mail from: JoannaAllegro@costam.pl");
        System.out.println("Subject: Order confirmation \n" );
        System.out.println("Hello " + getOrder().getBuyer().getName() + ",");
        System.out.println("We would like to confirm your order: " + getOrder().getProduct().getName() +", quantity: " + getOrder().getQuantity());
        System.out.println("Estimated delivery date: " + getOrder().getDate().plusDays(7) + "\n");
        System.out.println("Thank you for using our shop. \n Joanna Allegro" );
    }
}
