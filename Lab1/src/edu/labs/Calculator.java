package edu.labs;

import java.util.Scanner;

/*
Class implements Task9
 */
public class Calculator {

    private static void calculateInts(final String s1, final String s2, final char operation) {
        final int num1 = Integer.parseInt(s1);
        final int num2 = Integer.parseInt(s2);
        final double answer;
        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = (double) num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + answer);
    }

    private static void calculateDoubles(final CustomDouble num1, final CustomDouble num2,
            final char operation) {
        final double answer;
        switch (operation) {
            case '+':
                answer = num1.sum(num2).toDouble();
                break;
            case '-':
                answer = num1.subtraction(num2).toDouble();
                break;
            case '*':
                answer = num1.toDouble() * num2.toDouble();
                break;
            case '/':
                answer = num1.toDouble() / num2.toDouble();
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + answer);
    }

    public static CustomDouble stringToCustomDouble(String s) {
        if (!s.contains(".")){
            s=s +".0";
        }
        int whole = Integer.parseInt(s.substring(0, s.indexOf(".")));
        double fractional = Double.parseDouble(s.substring(s.indexOf(".")));
        return new CustomDouble(whole, fractional);
    }

    public static void main(String[] args) {
        final Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers:\n");
        final String s1 = reader.nextLine();
        final String s2 = reader.nextLine();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        char operation = reader.next().charAt(0);
        if (!s1.contains(".") && !s2.contains(".")) {
            calculateInts(s1, s2, operation);
        }
        else {
            final CustomDouble customDouble1 = stringToCustomDouble(s1);
            final CustomDouble customDouble2 = stringToCustomDouble(s2);
            calculateDoubles(customDouble1, customDouble2, operation);
        }
    }

}
