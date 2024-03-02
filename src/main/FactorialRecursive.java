package main;

public class FactorialRecursive {

    public int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public int fiboRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }
}
