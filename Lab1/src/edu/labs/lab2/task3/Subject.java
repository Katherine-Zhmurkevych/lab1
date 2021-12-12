package edu.labs.lab2.task3;

public class Subject {

    private final String id;
    private final String name;
    private final String teacher;

    public Subject(String id, String name, String teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return " " + name + " ";
    }
}
