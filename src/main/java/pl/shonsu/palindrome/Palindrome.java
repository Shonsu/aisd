package pl.shonsu.palindrome;

import java.util.Arrays;

public class Palindrome {
    public static boolean checkIfPalindrome(char[] arr) {

        if (arr.length <= 1) {
            return true;
        }
        if (arr[0] == arr[arr.length - 1]) {
            return checkIfPalindrome(Arrays.copyOfRange(arr, 1, arr.length - 1));
        } else {
            return false;
        }

    }

    public static void reversePalindrome(char[] arr, int a) {
        int shift = (arr.length % 2 != 0) ? 1 : 0;
        int half = (arr.length / 2) + shift;
        if (half - a == shift) {
            return;
        } else {
            char tmp = arr[a];
            arr[a] = arr[half + a];
            arr[half + a] = tmp;
            reversePalindrome(arr, a + 1);
        }
    }
}
