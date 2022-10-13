package pl.shonsu.sort;

public class MergeSort {

    public static void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(A, p, q);
            sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i = 0;
        int j = 0;

        for (; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        i = 0;
        j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k++] = L[i++];
            } else {
                A[k++] = R[j++];
            }
        }

        while (i < n1) {
            A[k++] = L[i++];
        }
        while (j < n2) {
            A[k++] = R[j++];
        }
    }
}
