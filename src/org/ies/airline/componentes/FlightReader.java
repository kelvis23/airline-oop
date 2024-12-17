package org.ies.airline.componentes;

import org.ies.airline.model.Flight;
import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class FlightReader {
    private final Scanner scanner;
    private final PassengerReader passengerReader;

    public FlightReader(Scanner scanner, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.passengerReader = passengerReader;
    }

    public Flight read() {
        System.out.println("informasion de el vuelo");
        System.out.println("numero de vuelo");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Origen del vuelo");
        String origin = scanner.nextLine();
        System.out.println("destino  del vuelo");
        String destination = scanner.nextLine();
        System.out.println("Puerta de enbarque del vuelo");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("cuantos pasageros tiene el vuelo");
        int size = scanner.nextInt();
        scanner.nextLine();
        Passenger[] passengers = new Passenger[size];
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = passengerReader.read();

        }
        return new Flight(
                flightNumber,
                origin,
                destination,
                gateNumber,
                passengers
        );
    }
}
