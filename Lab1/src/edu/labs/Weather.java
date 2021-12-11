package edu.labs;

public class Weather {

    private final String cloudiness;
    private final String wind;
    private final int temperature;
    private final int humidity;

    public Weather(String cloudiness, String wind, int temperature, int humidity) {
        this.cloudiness = cloudiness;
        this.wind = wind;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "the temperature – " + temperature + " C degrees, " + cloudiness + " cloudiness with " + wind +
                " wind. The humidity will be " + humidity + "%";
    }
}
