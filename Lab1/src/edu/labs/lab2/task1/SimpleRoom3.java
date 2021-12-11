package edu.labs.lab2.task1;

public class SimpleRoom3 extends SimpleRoom2 {

    private static int windows;

    static {
        windows = 2;
        System.out.println("Static initialization on \'windows\' field");
        System.out.println("Room will have " + windows+" windows.");
    }

    public SimpleRoom3(final double w, final double l, final double h) {
        super(w, l, h);
        System.out.println("SimpleRoom3 was created");
    }

    public void info3() {
        super.info2();
        System.out.println("Room has " + windows+" windows.");

    }
}
