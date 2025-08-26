package kh.edu.istad.javamethod.helper;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scan = new Scanner(System.in);

    public static double getDecimal(String label) {
        do {
            try {
                System.out.print(label + ": ");
                return Double.parseDouble(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (true);
    }

    public static int getInteger(String label) {
        do {
            try {
                System.out.print(label + ": ");
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer");
            }
        } while (true);
    }

    public static String getText(String label, int min, int max) {
        do {
            System.out.print(label + ": ");
            String text = scan.nextLine().trim(); // to ignore space between
            if (text.length() >= min && text.length() <= max) {
                return text;
            } else {
                System.out.println("Text must be between" + min + "->" + max);
            }
        } while (true);
    }
}
