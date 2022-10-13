package pl.shonsu.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import static pl.shonsu.search.BinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) {

        int[] tab = generateDataArray(10, 0, 10);
        int[] tab_2 = Arrays.copyOf(tab, tab.length);
        int[] tab_3 = Arrays.copyOf(tab, tab.length);

      //  tab = new int[]{6, 3, 5, 7, 8, 10, 3, 2, 11};
        System.out.println(Arrays.toString(tab) + "\n");

        Instant start = Instant.now();
        //MergeSort.sort(tab, 0, tab.length - 1);
        InsertSort.sortWithBinary(tab);
        Instant stop = Instant.now();
        Duration timeElapsed = Duration.between(start, stop);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");

        System.out.println(Arrays.toString(tab));
        int result = binarySearch(tab, 1, 0, tab.length - 1);
        int result2 = Arrays.binarySearch(tab, 1);
        System.out.println("Result: " + result);
        System.out.println("Result: " + result2);

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
