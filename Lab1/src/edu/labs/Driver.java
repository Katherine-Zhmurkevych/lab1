package edu.labs;

import java.util.Objects;

public class Driver {

    private final String name;
    private final String surname;
    private final int age;
    private final int drivingExperience;
    private final double rate;

    public Driver(String name, String surname, int age, int drivingExperience, double rate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.drivingExperience = drivingExperience;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age &&
                drivingExperience == driver.drivingExperience &&
                rate == driver.rate &&
                Objects.equals(name, driver.name) &&
                Objects.equals(surname, driver.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, drivingExperience, rate);
    }

    @Override
    public String toString() {
        return name + " " + surname + " who is " + age + " years old, has " +
                drivingExperience + " years of driving experience and " + rate + " rate";

    }
}
