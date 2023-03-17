package pl.shonsu.sort;

public class BubbleSort {
    public static void sort(int[] A) {
        int l = A.length;
        for (int i = 0; i < l; i++) {
            for (int j = l - 1; j > i ; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                }
            }
        }
    }
}
