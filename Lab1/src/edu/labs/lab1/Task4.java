package edu.labs;

public class Task4 {

    public static String fizzBuzz() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += " FizzBuzz";
            } else if (i % 3 == 0) {
                result += " Fizz";
            } else if (i % 5 == 0) {
                result += " Buzz";
            } else {
                result += " " + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }
}
