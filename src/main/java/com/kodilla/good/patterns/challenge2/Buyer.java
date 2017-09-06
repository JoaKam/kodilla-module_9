package com.kodilla.good.patterns.challenge2;

import java.util.HashMap;

public class Buyer {

    String nick;
    String name;
    String phoneNumber;
    String email;

    public Buyer(final String nick, final String name, final String phoneNumber, final String email) {
        this.nick = nick;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "nick='" + nick + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
