package org.ies.airline.componentes;

import org.ies.airline.model.Airleine;

import java.util.Scanner;

public class AirlineApp1 {

    private final AirlineReader airlineReader;


    public AirlineApp1(AirlineReader airlineReader) {
        this.airlineReader = airlineReader;
    }

    public static  void rum (AirlineReader airlineReader){
        Scanner scanner = new Scanner(System.in);
        Airleine airleine = airlineReader.read();
        // 1 pedir los datos de la areoliniea
        System.out.println("datos de la areolina");
       airleine.airleineInfo();
       // 2 pide al usuario un numero
        System.out.println(" introduce en numero de vuelo");
        int num = scanner.nextInt();
        scanner.nextLine();
        // 3  busca el buelo con ese numero de vuelo
        airleine.show(num);
        // 4 pide al suurio un pasagero
        System.out.println("introduce un pasagero");
        String nif = scanner.nextLine();

        // 5 Busca a ese pasajero dento del vuelo
        airleine.showPassengerFlights(nif);

        // 6 MUESTRA LOS DATOS DEL PASAGERO

        // 7 PIDE UN NUMERO DE ASIENTO
        System.out.println("introduce el numero de asiento");
        // 8 CABIAR EL ASIENTO DEL PASAGERO

    }

}
