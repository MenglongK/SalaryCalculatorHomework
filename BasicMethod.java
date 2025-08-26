package kh.edu.istad.javamethod;

public class BasicMethod {
    // Method (Define method) create static modifier for call in static
    static void welcome() {
        System.out.println("Welcome to Java Method");
    }

    static int findMax(int x, int y) {
        if (x > y)
            return x;
        else return y;
    }

    public static void main(String[] args) {
        // Invoke method
        welcome(); // to called function in static modifier we need to create function with static modifier due only static modifier called with static modifier
        int max = findMax(10, 20);
        System.out.println("Max: " + max);
    }
}
