package kh.edu.istad.javamethod;

import java.util.Scanner;

public class SalaryCaculation {
    private static final Scanner scan = new Scanner(System.in);

    private static int getInteger(String label) {
        do {
            try {
                System.out.print(label + ": ");
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input must be number of integer");
            }
        } while (true);
    }

    private static double baseSalary() {
        return (60 * 4) * 8;
    }

    private static double overTime(int hour) {
        if (hour > 40) {
            return (baseSalary() * 1.5) - baseSalary();
        } else return hour * 8;
    }

    public static void main(String[] args) {
        int hours = getInteger("Enter hours");
        System.out.println("---------------------");
        System.out.println("You work overtime: " + hours);
        System.out.println("---------------------");
        double totalSalary = baseSalary() + overTime(hours);
        System.out.println("Total of your salary: " + totalSalary);
    }
}
