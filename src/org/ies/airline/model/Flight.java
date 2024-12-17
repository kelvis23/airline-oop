package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int flighNumber;
    private String origin;
    private String destination;
    private int gateNumeber;
    private Passenger[] passengers;

    public Flight(int flighNumber, String origin, String destination, int gateNumeber, Passenger[] passengers) {
        this.flighNumber = flighNumber;
        this.origin = origin;
        this.destination = destination;
        this.gateNumeber = gateNumeber;
        this.passengers = passengers;
    }
    public void  flightInfo(){
        System.out.println("numero de vuelo " +flighNumber+"origen" +origin+"destino"+destination+"puerta de envarque"+gateNumeber+"pasegeros");
        for (var pasajero : passengers){
            pasajero.passengerInfo();
        }
    }
    public int getFlighNumber() {
        return flighNumber;
    }

    public void setFlighNumber(int flighNumber) {
        this.flighNumber = flighNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getGateNumeber() {
        return gateNumeber;
    }

    public void setGateNumeber(int gateNumeber) {
        this.gateNumeber = gateNumeber;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getFlighNumber() == flight.getFlighNumber() && getGateNumeber() == flight.getGateNumeber() && Objects.equals(getOrigin(), flight.getOrigin()) && Objects.equals(getDestination(), flight.getDestination()) && Objects.deepEquals(getPassengers(), flight.getPassengers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlighNumber(), getOrigin(), getDestination(), getGateNumeber(), Arrays.hashCode(getPassengers()));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flighNumber=" + flighNumber +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", gateNumeber=" + gateNumeber +
                ", passengers=" + Arrays.toString(passengers) +
                '}';

    }
}
