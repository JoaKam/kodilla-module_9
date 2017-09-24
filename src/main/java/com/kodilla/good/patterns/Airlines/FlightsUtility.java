package com.kodilla.good.patterns.Airlines;

import java.util.ArrayList;

public class FlightsUtility {
    public static ArrayList<Flight> createFlightsList() {

        ArrayList<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Warsaw", "London"));
        flightsList.add(new Flight("Warsaw", "Rome"));
        flightsList.add(new Flight("Warsaw", "Berlin"));
        flightsList.add(new Flight("Rome", "Moscow"));
        flightsList.add(new Flight("Berlin", "London"));
        flightsList.add(new Flight("Berlin", "Moscow"));
        flightsList.add(new Flight("Paris", "Moscow"));
        flightsList.add(new Flight("Paris", "Madrid"));
        flightsList.add(new Flight("Moscow", "Skopje"));

        return flightsList;

    }
}
