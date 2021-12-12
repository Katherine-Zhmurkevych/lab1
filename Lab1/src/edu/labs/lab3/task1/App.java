package edu.labs.lab3.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class App {
    public static final String NO_DIGITS_AND_SPACES_REGEXP = "^[^0-9\\s]+$";
    public static final String EMAIL_REGEXP = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

    public static List<User> users;

    public static void prepareUsers() {
        final Address address1 = new Address("Ukraine", "Lviv", "Naukova", "15");
        final Address address2 = new Address("Ukraine", "Kyiv", "Bassarabka", "110");
        final Address address3 = new Address("Ukraine", "Kyiv", "Volodymyrska", "3");
        final Address address4 = new Address("Ukraine", "Ivano Frankivsk", "Vokzalna", "25");
        final Address address5 = new Address("Ukraine", "Ternopil", "Center square", "34");

        final User user1 = new User("Ivan", "Vasyliv", "ivasyliv@gmail.com", 25, address1);
        final User user2 = new User("Petro", "Shultz", "petroshultz@gmail.com", 26, address2);
        final User user3 = new User("Volodymyr", "Dyn", "volodymyrdyn@gmail.com", 28, address3);
        final User user4 = new User("Bogdan", "Takyi", "bogdantakyi@gmail.com", 22, address4);
        final User user5 = new User("Pavlo", "Karyi", "pavlokaryi@gmail.com", 24, address5);
        users = Arrays.asList(user1, user2, user3, user4, user5);
    }

    public static void validateUser(final User user) {
        emptyFieldValidation(user.getFirstName());
        noDigitsAndSpacesValidation(user.getFirstName());

        emptyFieldValidation(user.getLastName());
        noDigitsAndSpacesValidation(user.getLastName());

        ageValidation(user.getAge());
        emailValidation(user.getEmail());
        addressValidation(user.getAddress());
    }

    private static void addressValidation(final Address address) {
        if(Objects.isNull(address)){
            throw new UserValidationException("Invalid user address", ErrorCode.BAD_REQUEST);

        }
    }

    private static void ageValidation(final int age) {
        if (age <= 0) {
            throw new UserValidationException("Invalid age value", ErrorCode.BAD_REQUEST);
        }
    }

    private static void emptyFieldValidation(final String fieldValue) {
        if (fieldValue.isEmpty()) {
            throw new UserValidationException("Empty field value", ErrorCode.BAD_REQUEST);
        }
    }

    private static void noDigitsAndSpacesValidation(final String fieldValue) {
        if (!fieldValue.matches(NO_DIGITS_AND_SPACES_REGEXP)) {
            throw new UserValidationException("Invalid symbols in the field value", ErrorCode.BAD_REQUEST);
        }
    }

    private static void emailValidation(final String emailValue) {
        if (!emailValue.matches(EMAIL_REGEXP)) {
            throw new UserValidationException("Invalid email", ErrorCode.BAD_REQUEST);
        }
    }

    public static void main(String[] args) {
        prepareUsers();
        for (User user : users) {
            validateUser(user);
            System.out.println(user + " passed all validations.");
        }
    }

}
