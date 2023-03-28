package pl.shonsu.arrays.inversions;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        List<String> result = Inversions.determine(arr);
        System.out.println(result);
        System.out.println(MergeSortAndCount.sortAndCount(arr, 0, arr.length-1));
        System.out.println(Arrays.toString(arr));
    }
}
