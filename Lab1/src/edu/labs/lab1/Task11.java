package edu.labs;

public class Task11 {

    public static void main(String[] args) {
        final Order firstOrder = new Order("45 Green str.",
                new Driver("Jason", "Statham", 45, 25, 5),
                new Car("Audi", "A8", 50000, 2021, "A001A"));
        final Order secondOrder = new Order("108 Horodotska str.",
                new Driver("Dominic", "Toretto", 50, 30, 4.5),
                new Car("Chevrolet", "Corvette", 35000, 2021, "A181O"));
        System.out.println(firstOrder);
        System.out.println(secondOrder);
    }
}
