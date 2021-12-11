package edu.labs;

public class Task8 {
    public static void main(String[] args) {

        final CustomDouble customDouble1 = new CustomDouble(5, 0.34);
        final CustomDouble customDouble2 = new CustomDouble(7, 0.45);

        System.out.println(customDouble1.toString());
        System.out.println(customDouble2.toString());
        final CustomDouble sum = customDouble1.sum(customDouble2);
        System.out.println("Sum of CustomDouble is ->" + sum.toString());
        final CustomDouble subtraction = customDouble1.subtraction(customDouble2);
        System.out.println("Subtruction of CustomDouble is ->" + subtraction.toString());


        System.out.println(
                customDouble1.toString() + " is greater than " + customDouble2.toString() + " -> " +
                        customDouble1.lesserThan(customDouble2));
    }
}
