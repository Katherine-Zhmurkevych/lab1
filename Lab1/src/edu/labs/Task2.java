package edu.labs;

public class Task2 {

    public static int countChar(char symbol, String[] stringArray) {
        int counter = 0;
        for (String stringItem : stringArray) {
            for (char character : stringItem.toCharArray()) {
                if (character == symbol) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        stringArray[0] = "abcd";
        stringArray[1] = "abc";
        stringArray[2] = "abcdefg";
        stringArray[3] = "abcdef";
        stringArray[4] = "abcdefgh";
        System.out.println(countChar('g', stringArray));
    }
}
