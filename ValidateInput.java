package kh.edu.istad.javamethod;

import kh.edu.istad.javamethod.helper.InputHelper;

public class ValidateInput {
    public static void main(String[] args) {
        double number = InputHelper.getDecimal("Enter number");
        double salary = InputHelper.getDecimal("Enter salary");
        System.out.println(number);
        System.out.println(salary);
        int age = InputHelper.getInteger("Enter number of integer");
        double salaryOfInteger = InputHelper.getDecimal("Enter salary of integer");
        System.out.println(age);
        System.out.println(salaryOfInteger);
        String validateText = InputHelper.getText("Enter full name", 4, 10);
        System.out.println("Your text: " + validateText);
        System.out.println("Full name: " + validateText);
    }
}
