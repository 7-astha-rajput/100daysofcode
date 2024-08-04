class Solution {
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0; // fib(0)
        int b = 1; // fib(1)
        int fib = 0;

        // Calculate Fibonacci numbers iteratively
        for (int i = 2; i <= n; i++) {
            fib = a + b; // fib(i) = fib(i-1) + fib(i-2)
            a = b; // Move forward in the sequence
            b = fib; // Move forward in the sequence
        }

        return fib;
    }
}

