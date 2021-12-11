package edu.labs;

public class Task1 {

    public static void printArray(final String[] array) {
        for (String stringItem : array) {
            System.out.println(stringItem);
        }
    }

    public static String[] sortArray(final String[] incomeArray) {

        for (int i = incomeArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (incomeArray[j].length() > incomeArray[j + 1].length()) {
                    String tmp = incomeArray[j];
                    incomeArray[j] = incomeArray[j + 1];
                    incomeArray[j + 1] = tmp;
                }
            }
        }
        return incomeArray;
    }

    public static void main(String[] args) {

        final String[] stringArray = new String[5];
        stringArray[0] = "abcdasd";
        stringArray[1] = "abc";
        stringArray[2] = "abcdefg";
        stringArray[3] = "abcdef";
        stringArray[4] = "abcdefghasda";

        final String[] result = sortArray(stringArray);

        printArray(result);
    }
}


