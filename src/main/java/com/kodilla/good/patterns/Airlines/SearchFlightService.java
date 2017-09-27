package com.kodilla.good.patterns.Airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchFlightService {

    public SearchFlightService() {
    }

    private static String provideAirport(String type) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter the " + type + " airport:");
        final String airport = keyboard.nextLine();

        return airport;
    }

    public static List<Flight> findFlightsFrom(final ArrayList<Flight> flightsList) {

        final String departureCity = provideAirport("departure");

        List<Flight> foundFlightsList = flightsList.stream()
                .filter(f -> f.getDepartureAirport().equals(departureCity))
                .collect(Collectors.toList());

        return foundFlightsList;
    }


    public static List<Flight> findFlightsTo(final ArrayList<Flight> flightsList) {

        final String destinationCity = provideAirport("destination");

        List<Flight> foundFlightsList = flightsList.stream()
                .filter(f -> f.getArrivalAirport().equals(destinationCity))
                .collect(Collectors.toList());

        return foundFlightsList;
    }

    public static List<Flight> findDirectFlights(final ArrayList<Flight> flightsList) {

        final String departureCity = provideAirport("departure");
        final String destinationCity = provideAirport("destination");

        Flight searchedFlight = new Flight(departureCity, destinationCity);

        List<Flight> foundFlightsList = flightsList.stream()
                .filter(f -> f.equals(searchedFlight))
                .collect(Collectors.toList());

        return foundFlightsList;
    }

    public static List<String> findIndirectFlights(final ArrayList<Flight> flightsList) {

        List<String> foundFlightsList = new ArrayList<>();
        List<Flight> foundFlightsFrom = findFlightsFrom(flightsList);
        List<Flight> foundFlightsTo = findFlightsTo(flightsList);

        for (Flight flightFrom : foundFlightsFrom) {
            String changeAirport = flightFrom.getArrivalAirport();

            for (Flight flightTo : foundFlightsTo) {
                if (changeAirport.equals(flightTo.getDepartureAirport())) {
                    foundFlightsList.add("Flight " + flightFrom.getDepartureAirport() + " - " + changeAirport + " - " + flightTo.getArrivalAirport());
                }

            }
        }
        return foundFlightsList;
    }
}
