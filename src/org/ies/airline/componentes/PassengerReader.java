package org.ies.airline.componentes;

import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class PassengerReader {
    private final Scanner scanner;

    public PassengerReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Passenger read(){
        System.out.println("Informasion del pasagero");
        System.out.println("Nif");
        String nif = scanner.nextLine();
        System.out.println("nombre");
        String name =scanner.nextLine();
        System.out.println("apellido");
        String surname =scanner.nextLine();
        System.out.println("Numero de asiento");
        Integer seatNumber = scanner.nextInt();
        return new Passenger(
                nif,
                name,
                surname,
                seatNumber
        );
    }
}
