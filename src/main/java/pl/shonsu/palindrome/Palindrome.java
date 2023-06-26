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

    public static boolean checkIfPalindrome(String s) {
        boolean palindrome = true;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfPalindrome2(String s) {
        String reversedString = new StringBuilder(s).reverse().toString();
        return reversedString.equals(s);
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

    public static char[] reversePalindrome2(char[] arr) {
        String str = String.valueOf(arr);
        StringBuilder sb = new StringBuilder();
        int shift = (str.length() % 2 == 0) ? 0 : 1;
        int end = str.length() / 2 + shift;
        sb.append(str.substring(0, end));
        sb.reverse();
        sb.append(new StringBuilder(str.substring(end - shift, str.length())).reverse().substring(shift));
        return sb.toString().toCharArray();
    }

    public static String longestPalindromicSubstring(String s) {
        String result = "";
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                String check = s.substring(start, end + 1);

                boolean palindrome = true;
                for (int k = 0; k < (end - start + 1) / 2; k++) {
                    if (s.charAt(start + k) != s.charAt(end - k)) {
                        palindrome = false;
                        break;
                    }
                }
                if (palindrome && result.length() < check.length()) {
                    result = check;
                }
            }
        }
        return result;
    }

    public static String longestPalindromicSubstring2(String s) {

        int stringLength = s.length();
        if (stringLength == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            int j = stringLength - 1;
            while (i < j) {
                if (s.charAt(i) == s.charAt(j) && result.length() < (j - i + 1)) {
                    String tmp = s.substring(i, j + 1);
                    if (checkIfPalindrome2(tmp)) {
                        if (result.length() < tmp.length()) {
                            result = tmp;
                        }
                    }

                }
                j--;
            }
        }

        return result.isEmpty() ? s.substring(0, 1) : result;
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s.substring(0, 1);

        int len = s.length();
        int longestPalindromeStart = 0;
        int longestPalindromeLength = 1;
        boolean[][] state = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            state[i][i] = true;
            for (int dist = 1; dist < len - i; dist++) {
                int j = dist + i;
                state[i][j] = (dist == 1) ? (s.charAt(i) == s.charAt(j)) : (s.charAt(i) == s.charAt(j) && state[i + 1][j - 1]);
                if (state[i][j] && j - i + 1 > longestPalindromeLength) {
                    longestPalindromeLength = j - i + 1;
                    longestPalindromeStart = i;
                }
            }

        }
        return s.substring(longestPalindromeStart, longestPalindromeStart + longestPalindromeLength);
    }


}
