package edu.labs;

public class Task3 {

    public static String putTwoArraysAlternatelyInOneString(char[] charArray, int[] intArray) {
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            result += (String.valueOf(intArray[i]) + String.valueOf(charArray[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'g', 'h', 'z', 'o', 'p'};
        int[] intArray = {7, 2, 4, 4, 2, 1, 8, 3};
        System.out.println(putTwoArraysAlternatelyInOneString(charArray, intArray));
    }
}
