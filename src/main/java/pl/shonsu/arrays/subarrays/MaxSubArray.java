package pl.shonsu.arrays.subarrays;

public class MaxSubArray {


    static int maxSubArray(int[] A, int start, int end) {

        if (start > end) {
            return Integer.MIN_VALUE;
        }

        if (start == end) {
            return A[start];
        }
        int mid = (start + end) / 2;

        return Math.max(
                Math.max(maxSubArray(A, start, mid - 1), maxSubArray(A, mid + 1, end)),
                maxCrossingSubArray(A, start, mid, end)
        );
    }

    static int maxCrossingSubArray(int[] A, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += A[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid; i <= high; i++) {
            sum += A[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return Math.max(leftSum + rightSum - A[mid], Math.max(leftSum, rightSum));
    }


}
