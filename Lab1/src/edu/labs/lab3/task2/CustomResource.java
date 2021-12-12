package edu.labs.lab3.task2;

public class CustomResource implements AutoCloseable {

    public CustomResource() {
        System.out.println("AutoClosable resource was created");
    }

    public void performAction() {
        System.out.println("Action was successful.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed CustomResource.");
    }
}
