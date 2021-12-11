package edu.labs.lab2.task1;

public class SimpleRoom2 extends SimpleRoom {

    protected double height;

    protected String color;

    {
        color = "Red";
        System.out.println("Non static initialization of \'color\' field");
        System.out.println("SimpleRoom2 with color-> " + color);
    }

    public SimpleRoom2(double w, double l, double h) {
        super(w, l);
        height = h;
        System.out.println("SimpleRoom2 was created");
    }

    public void info2() {
        super.info();
        System.out.println("Room volume: " + width * length * height);
        System.out.println("Room color is " + color);
    }

}
