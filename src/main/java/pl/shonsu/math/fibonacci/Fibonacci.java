package pl.shonsu.math.fibonacci;

public class Fibonacci {
    public static int iterative(int n) {
        int f1 = 0;
        int f2 = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = f2;
            f2 += f1;
            f1 = f2 - f1;

        }
        return result;
    }

    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    public static int dynamic(int n) {
        int[] tab = new int[n + 2];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i <= n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[n];
    }
}
