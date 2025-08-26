package kh.edu.istad.javamethod;

public class Recursive {
    public static void main(String[] args) {
        speak(10);
        int result = factorial(5);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static void speak(int n) {
        if (n == 0) return;
        System.out.println("I am speaking: " + n);
        speak(n - 1);
    }
}
