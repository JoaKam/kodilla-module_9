package com.kodilla.good.patterns.Airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightSearchProcessor {

    public static int selectSearchType() {

        int searchType = 5;

        while (searchType > 4) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select the search type:\n [1] Flight from \n [2] Flight to \n [3] Direct flights \n [4] Indirect flights \n [0] EXIT");
            searchType = keyboard.nextInt();
        }

        return searchType;
    }

    public static List<String> searchFlight(int searchType) {

        List<Flight> foundFlights = new ArrayList<>();
        List<String> foundFlightsFinal;
        ArrayList<Flight> flightsList = FlightsUtility.createFlightsList();

        switch (searchType) {

            case 0:
                return null;
            case 1:
                foundFlights = SearchFlightService.findFlightsFrom(flightsList);
                break;
            case 2:
                foundFlights = SearchFlightService.findFlightsTo(flightsList);
                break;
            case 3:
                foundFlights = SearchFlightService.findDirectFlights(flightsList);
                break;
            case 4:
                foundFlightsFinal = SearchFlightService.findIndirectFlights(flightsList);
                return foundFlightsFinal;
        }

        foundFlightsFinal = foundFlights.stream()
                .map(f -> f.toString())
                .collect(Collectors.toList());

        return foundFlightsFinal;
    }

}
