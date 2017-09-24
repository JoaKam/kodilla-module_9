package com.kodilla.good.patterns.Airlines;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int searchType = FlightSearchProcessor.selectSearchType();
        List<String> foundFlights = FlightSearchProcessor.searchFlight(searchType);

        if (foundFlights.size() != 0) {
            System.out.println("Searching results:");
            foundFlights.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("Flight not found.");
        }

    }
}
