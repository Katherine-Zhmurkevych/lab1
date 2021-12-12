package edu.labs;

import java.util.Objects;

public class Order {

    private final String address;
    private final Driver driver;
    private final Car car;

    public Order(String address, Driver driver, Car car) {
        this.address = address;
        this.driver = driver;
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(address, order.address) &&
                Objects.equals(driver, order.driver) &&
                Objects.equals(car, order.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, driver, car);
    }

    @Override
    public String toString() {
        return "An order to " + address + " is taken by " + driver + " on " + car;
    }
}
