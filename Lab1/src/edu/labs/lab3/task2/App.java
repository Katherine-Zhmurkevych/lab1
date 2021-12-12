package edu.labs.lab3.task2;

public class App {
    public static void main(String[] args) {
        try (CustomResource cr = new CustomResource()) {
            cr.performAction();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
