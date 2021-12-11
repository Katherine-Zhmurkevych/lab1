package edu.labs.lab2.task1;

public class SimpleRoom {

    protected double width;
    protected double length;


    public SimpleRoom(final double width, final double length) {
        this.width = width;
        this.length = length;
        System.out.println("SimpleRoom was created");
    }

    public void info() {
        System.out.println("Room: width = " + width + ", length = " + length);
        System.out.println("Room square: " + width * length);
    }

}

