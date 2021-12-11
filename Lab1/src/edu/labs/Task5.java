package edu.labs;

public class Task5 {


    public static int[][] inputData() {

        final int[][] data = new int[4][2];
        data[0][0] = 3;
        data[0][1] = 2;

        data[1][0] = 5;
        data[1][1] = 8;

        data[2][0] = 7;
        data[2][1] = 5;

        data[3][0] = 9;
        data[3][1] = 8;

        return data;
    }

    public static void printData(final int[][] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(" " + data[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transponseData(final int[][] data) {

        final int columnCount = data[0].length;
        final int rowCount = data.length;
        int[][] result = new int[columnCount][rowCount];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = data[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final int[][] data = inputData();
        final int[][] tData = transponseData(data);
        printData(data);
        System.out.println();
        printData(tData);
    }
}
