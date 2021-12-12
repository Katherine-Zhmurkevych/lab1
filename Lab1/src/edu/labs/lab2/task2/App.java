package edu.labs.lab2.task2;

public class App {
    public static void main(String[] args) {
        final int maxSizeOfStack = 5;
        final String[] incomingArray = new String[maxSizeOfStack];

        final CustomStack<String> stack = new CustomStack<>(incomingArray);
        stack.pushElement("abc");
        stack.pushElement("abcd");
        stack.pushElement("uqyewtruq");
        stack.pushElement("iolkasd");
        stack.pushElement("qwert");

        System.out.println(stack.popElement());

        for (final String item : stack) {
            System.out.println(item);
        }

    }
}