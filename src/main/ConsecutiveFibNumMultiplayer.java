package main;

public class ConsecutiveFibNumMultiplayer {

    // returns true if 2 fib numbers multiplication is = param, else returs the closest 2 fib nums as false
    public long[] productFib(long prod) {
        long n1 = 0, n2 = 1, n3;
        while (true) {
            if (n1 * n2 == prod) {
                return new long[]{n1, n2, 1};
            } else if (n1 * n2 < prod) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            } else if (n1 * n2 > prod) {
                return new long[]{n1, n2, 0};
            }
        }


    }
}
