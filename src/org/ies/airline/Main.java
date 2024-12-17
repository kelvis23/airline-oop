package org.ies.airline;

import org.ies.airline.componentes.AirlineApp1;
import org.ies.airline.componentes.AirlineReader;
import org.ies.airline.componentes.FlightReader;
import org.ies.airline.componentes.PassengerReader;
import org.ies.airline.model.Airleine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassengerReader passengerReader = new PassengerReader(scanner);
        FlightReader flightReader = new FlightReader(scanner, passengerReader);
        AirlineReader airlineReader = new AirlineReader(scanner, flightReader);
        AirlineApp1 airlineApp1 = new AirlineApp1(airlineReader);

       AirlineApp1.rum(airlineReader);
    }


}
