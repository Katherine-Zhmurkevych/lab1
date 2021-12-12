package edu.labs.lab3.task1;

public class Address {
    private String country;
    private String city;
    private String street;
    private String houseNumber;

    public Address(final String country, final String city, final String street, final String houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return " " + country + ',' + " " + city + "," + street + " " + houseNumber + " ";
    }
}
