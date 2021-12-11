package edu.labs;

import java.util.Objects;

/*
Class implements Task7
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User() {
    }

    public User(final String firstName, final String lastName, final int age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final User user = (User) o;
        return age == user.age && firstName.equals(user.firstName) && lastName.equals(user.lastName) && email
                .equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, email);
    }
}
