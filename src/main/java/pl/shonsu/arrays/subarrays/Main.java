package pl.shonsu.arrays.subarrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -5, -2, -9};
        int resultMax = MaxSubArray.maxSubArray(arr, 0, arr.length - 1);
        System.out.println(resultMax);
    }
}
