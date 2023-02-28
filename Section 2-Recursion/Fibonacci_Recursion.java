public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Fibonacci_Recursion rec = new Fibonacci_Recursion();
        int n = rec.fibonacci(3);
        System.out.println(n);
    }

    public int fibonacci(int a) {
        if (a < 0) {
            return -1;
        }
        if (a == 1 || a == 0) {
            return a;
        }
        return fibonacci(a-1) + fibonacci(a - 2);
    }
}