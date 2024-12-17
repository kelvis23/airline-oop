package org.ies.airline.componentes;

import org.ies.airline.model.Airleine;

import java.util.Scanner;

public class AirlineApp1 {

    private final AirlineReader airlineReader;


    public AirlineApp1(AirlineReader airlineReader) {
        this.airlineReader = airlineReader;
    }

    public static  void rum (AirlineReader airlineReader){
        Airleine airleine = airlineReader.read();
        System.out.println("datos de la areolina");
       airleine.airleineInfo();

    }
    public void showAirline(){

    }
}
