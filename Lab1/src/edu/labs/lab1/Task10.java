package edu.labs;

public class Task10 {

    public static void main(String[] args) {
        final Day monday = new Day("Monday", new Weather("heavy", "strong", 20, 35));
        final Day tuesday = new Day("Tuesday", new Weather("moderate", "light", 19, 40));
        final Day wednesday = new Day("Wednesday", new Weather("none", "mild", 21, 30));
        final Day thursday = new Day("Thursday", new Weather("moderate", "mild", 22, 33));
        final Day friday = new Day("Friday", new Weather("moderate", "light", 22, 35));
        final Day saturday = new Day("Saturday", new Weather("heavy", "strong", 20, 42));
        final Day sunday = new Day("Sunday", new Weather("none", "light", 23, 25));
        final Day[] weatherForecast = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
        for (Day day : weatherForecast) {
            System.out.println(day);
        }
    }
}
