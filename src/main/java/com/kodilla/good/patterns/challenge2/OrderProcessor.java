package com.kodilla.good.patterns.challenge2;

public class OrderProcessor {

    private LogIn log;
    private OrderService newOrder;

    public OrderProcessor(final LogIn log, final OrderService newOrder){
        this.log = log;
        this.newOrder = newOrder;
    }

    public void process() {
        Buyer thisBuyer = log.returnBuyer();
        Order thisOrder = newOrder.createOrder(thisBuyer);
        OrderInformationService newConfirmation = new OrderInformationService(thisOrder);
        newConfirmation.confirmOrder();
    }

}
