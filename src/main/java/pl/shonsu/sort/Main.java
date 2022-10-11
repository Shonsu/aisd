package pl.shonsu.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import static pl.shonsu.sort.SelectionSort.*;

public class Main {
    public static void main(String[] args) {

        int[] tab = generateDataArray(10, 0, 100);
        int[] tab_2 = Arrays.copyOf(tab, tab.length);
        int[] tab_3 = Arrays.copyOf(tab, tab.length);

        // System.out.println(Arrays.toString(tab));

//        Instant start = Instant.now();
//        selectionSort(tab);
//        Instant stop = Instant.now();
//
//        Duration timeElapsed = Duration.between(start, stop);
//        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
        int[] tab_int = new int[]{99, 1, 23, 5, 17, 9, 12, 1, 23, 15, 87};
        // int[] tab_int = new int[]{8, 3, 5, 6, 9, 1};
        System.out.println(Arrays.toString(tab_int));
        System.out.println(tab_int.length);
        // merge(tab_int, 0, tab_int.length / 2, tab_int.length);
        mergeSort(tab_int, 0, tab_int.length - 1);
        System.out.println(Arrays.toString(tab_int));

    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            //  System.out.println("q: " + q + ", r: " + r);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);

        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        System.out.println("n1: " + n1 + ", n2: " + n2);
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

    private static int[] generateDataArray(int length, int min, int max) {
        int[] array = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
        return array;
    }
}
