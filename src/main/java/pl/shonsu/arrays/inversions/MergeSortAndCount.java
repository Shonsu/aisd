package pl.shonsu.arrays.inversions;

import java.util.Arrays;

public class MergeSortAndCount {

    public static int sortAndCount(int[] A, int p, int r) {
        int count = 0;
        if (p < r) {
            int q = (p + r) / 2;
            count += sortAndCount(A, p, q);
            count += sortAndCount(A, q + 1, r);
            count += mergeAndCount(A, p, q, r);
        }
        return count;
    }

    private static int mergeAndCount(int[] A, int p, int mid, int r) {
        int swaps = 0;
        int n1 = mid - p + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i = 0;
        int j = 0;
        L = Arrays.copyOfRange(A, p, mid + 1);
        R = Arrays.copyOfRange(A, mid + 1, r + 1);

        i = 0;
        j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k++] = L[i++];
            } else {
                A[k++] = R[j++];
                swaps += (mid + 1) - (p + i);
            }
        }

        while (i < n1) {
            A[k++] = L[i++];
        }
        while (j < n2) {
            A[k++] = R[j++];
        }
        return swaps;
    }
}
