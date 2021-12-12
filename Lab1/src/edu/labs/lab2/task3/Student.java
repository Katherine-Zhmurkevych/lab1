package edu.labs.lab2.task3;

public class Student {

    private final String id;
    private final String name;
    private final String surname;
    private final int age;

    public Student(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " ";
    }
}
