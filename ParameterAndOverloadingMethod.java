package kh.edu.istad.javamethod;

public class ParameterAndOverloadingMethod {
    private static double sum(double x, double y) {
        System.out.println("X = " + x + ", Y = " + y);
        return x + y;
    }

    private static double sum(int x, int y) {
        System.out.println("X = " + x + ", Y = " + y);
        return x + y;
    }

    private static double sum(double x, double y, double z) {
        System.out.println("X = " + x + ", Y = " + y + "Z = " + z);
        return x + y + z;
    }

    private static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static double sumEven(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double result = sum(1.5, 1.5);
        System.out.println("-----------------------\nResult = " + result);
        double[] numberArray = {10, 30, 5};
        double totalSum = sum(numberArray);
        System.out.println("-----------------------\nTotal sum array = " + totalSum);
        double sumEven = sumEven(numberArray);
        System.out.println("-----------------------\nTotal sum Even = " + sumEven);
    }
}
