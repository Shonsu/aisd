package pl.shonsu.math;

public class Horner {

    public static int calculate(int[] poly, int x) {

        int result = poly[0];
        for (int i = 1; i < poly.length; i++) {
            result = x * result + poly[i];
        }
        return result;
    }

    public static int calculateRecursive(int[] poly, int x, int n) {
        if (n == 0) return poly[0];
        return (x * calculateRecursive(poly, x, n - 1) + poly[n]);
    }
}
