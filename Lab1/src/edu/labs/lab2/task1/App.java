package edu.labs.lab2.task1;

public class App {

    public static void main(String[] args) {
        final SimpleRoom s = new SimpleRoom(5, 5);
        s.info();

        final SimpleRoom2 s2 = new SimpleRoom2(5, 5, 3);
        System.out.println("Method info from SimpleRoom");
        s2.info();
        System.out.println();
        System.out.println("Method info2 from SimpleRoom2");
        s2.info2();
        final SimpleRoom3 s3 = new SimpleRoom3(6,5,3);
        System.out.println("Method info3 from SimpleRoom3");
        s3.info3();
    }
}
