package com.kodilla.good.patterns.challenge2;

import java.util.HashMap;
import java.util.Scanner;

public class LogIn {

    public String getNick() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter your nick");
        final String nick = keyboard.nextLine();
        return nick;
    }

    public Buyer returnBuyer() {

        String nick = getNick();
        Buyer thisBuyer;
        HashMap<String, Buyer> buyersMap = Buyer.generateBuyersMap();

        thisBuyer = buyersMap.get(nick);

        if (thisBuyer == null) {
            System.out.println("Nick not found. Create account:");

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please, enter your name");
            final String name = keyboard.nextLine();
            System.out.println("Please, enter your phone number");
            final String phoneNumber = keyboard.nextLine();
            System.out.println("Please, enter your email");
            final String email = keyboard.nextLine();

            System.out.println("Account created: ");
            thisBuyer = new Buyer(nick, name, phoneNumber, email);
            System.out.println(thisBuyer);

        } else {
            System.out.println("You have been successfully logged in.");
            System.out.println(thisBuyer);
        }

        return thisBuyer;

    }

}
