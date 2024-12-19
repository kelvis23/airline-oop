package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airleine {
    private String name;
    private Flight[] flights;

    public Airleine(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public void airleineInfo() {
        System.out.println("Aereolinia : " + name + ".");
        for (var flight : flights) {
            flight.flightInfo();
        }
    }

    public void show(int num) {
        for (var vuelo : flights) {
            if (vuelo.getFlighNumber() == num) {
                vuelo.flightInfo();
            } else {
                System.out.println("ERROR");
            }
        }
    }

    public void show1(String nif) {
        for (var vuel : flights) {
            //for (var pasage : flights.)
        }
    }

    public void showFlightsFromOrigin(String origin) {
        for (var flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                flight.flightInfo();
            }
        }
    }

    public Flight findFlight(int flightNum) {
        for (var flght : flights) {
            if (flght.getFlighNumber() == flightNum) {
                return flght;
            }
        }
        return null;
    }

    public void showPassengerFlights(String nif) {
        for (var flight : flights) {
            if (flight.hasPassenger(nif)) {
                flight.flightInfo();

            }
        }
    }

    public Object flndFlight(int num, String nif) {
        for (var flight : flights) {
            for (var passager : flight.getPassengers()) {
                if (passager.getNif().equals(nif) && flight.getFlighNumber() == num) {

                }
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airleine airleine = (Airleine) o;
        return Objects.equals(getName(), airleine.getName()) && Objects.deepEquals(getFlights(), airleine.getFlights());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), Arrays.hashCode(getFlights()));
    }

    @Override
    public String toString() {
        return "Airleine{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
