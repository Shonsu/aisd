package pl.shonsu.arrays;

import java.util.List;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        List<String> result = Inversions.determine(arr);
        System.out.println(result);
    }
}
