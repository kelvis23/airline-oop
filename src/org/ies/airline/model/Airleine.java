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