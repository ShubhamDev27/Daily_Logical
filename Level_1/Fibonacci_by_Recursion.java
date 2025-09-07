package Level_1;

public class Fibonacci_by_Recursion {

    // Recursive function to get nth Fibonacci number
    static int Fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num = 10; // print first 10 Fibonacci numbers

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
