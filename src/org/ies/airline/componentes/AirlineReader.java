package org.ies.airline.componentes;

import org.ies.airline.model.Airleine;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineReader {
    private final Scanner scanner;
    private final FlightReader flightReader;

    public AirlineReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }
    public Airleine read(){
        System.out.println("informasion de la aereolina");
        System.out.println("nombre de la areolinia");
        String name =scanner.nextLine();
        System.out.println("cuantos vuelos tiene la areolinia");
        int size =scanner.nextInt();
        scanner.nextLine();
        Flight[] flights =new Flight[size];
        for (int i = 0; i < flights.length; i++) {
            flights[i]=flightReader.read();

        }
        return new Airleine(
                name,
                flights
        );

    }
}
