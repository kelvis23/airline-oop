package org.ies.airline.componentes;

import java.util.Scanner;

public class AirlineAppMenu {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineAppMenu(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public static void run(Scanner scanner){
        int option;
        do {
            System.out.println("1.Muestra todo los vuelos");
            System.out.println("2.Mostrar vuelos de origen");
            System.out.println("3.Muestra los vuelos de un pasajero");
            System.out.println("4.Muestra el asiento de unpasajero");
            System.out.println("5.Cabiar de asiento a un pasajero");
            System.out.println("6.salir");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option !=5);
    }
}
