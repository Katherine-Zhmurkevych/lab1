package edu.labs;

public class Day {

    private final String name;
    public Weather weather;

    public Day(String name, Weather weather) {
        this.name = name;
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "On " + name + " the weather is expected to be as follows: "+ weather;
    }
}
