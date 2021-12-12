package edu.labs;

import java.util.Objects;

public class Car {

    private final String make;
    private final String model;
    private final int mileage;
    private final int manufactureYear;
    private final String plate;

    public Car(String make, String model, int mileage, int manufactureYear, String plate) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.manufactureYear = manufactureYear;
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage &&
                manufactureYear == car.manufactureYear &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(plate, car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, mileage, manufactureYear, plate);
    }

    @Override
    public String toString() {
        return "a " + manufactureYear + " year " + make + " " + model + " with " + mileage + " mileage and " + plate + " plate.";
    }
}
