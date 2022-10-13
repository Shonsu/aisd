package pl.shonsu.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

import static pl.shonsu.sort.BinarySearch.binarySearchRecursive;

public class Main {
    public static void main(String[] args) {

        int[] tab = generateDataArray(10, 0, 10);
        int[] tab_2 = Arrays.copyOf(tab, tab.length);
        int[] tab_3 = Arrays.copyOf(tab, tab.length);


        Instant start = Instant.now();
        MergeSort.sort(tab, 0, tab.length - 1);
        Instant stop = Instant.now();
        Duration timeElapsed = Duration.between(start, stop);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
        System.out.println(Arrays.toString(tab));
        int result = binarySearchRecursive(tab, 8, 0, tab.length - 1);
        System.out.println("Result: " + result);

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
