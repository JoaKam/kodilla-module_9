package com.kodilla.good.patterns.Airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightSearchProcessor {

    public static String selectSearchType() {

        String searchType = null;

        while (searchType == null) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select the search type:\n [1] Flight from \n [2] Flight to \n [3] Direct flights \n [4] Indirect flights \n [0] EXIT");
            searchType = keyboard.nextLine();
        }

        return searchType;
    }

    public static List<String> searchFlight(String searchType) {

        List<Flight> foundFlights;
        List<String> foundFlightsFinal;
        ArrayList<Flight> flightsList = FlightsUtility.createFlightsList();

        switch (searchType) {

            case "Flight from":
                foundFlights = SearchFlightService.findFlightsFrom(flightsList);
                break;
            case "Flight to":
                foundFlights = SearchFlightService.findFlightsTo(flightsList);
                break;
            case "Direct flights":
                foundFlights = SearchFlightService.findDirectFlights(flightsList);
                break;
            case "Indirect flights":
                foundFlightsFinal = SearchFlightService.findIndirectFlights(flightsList);
                return foundFlightsFinal;
            default:
                return null;
        }

        foundFlightsFinal = foundFlights.stream()
                .map(f -> f.toString())
                .collect(Collectors.toList());

        return foundFlightsFinal;
    }

}
