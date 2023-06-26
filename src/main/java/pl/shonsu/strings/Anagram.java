package pl.shonsu.strings;

import java.util.Arrays;

class Anagram {

    public static final int CHARACTER_RANGE = 256;

    public static boolean isAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] firstArry = first.toLowerCase().toCharArray();
        char[] secondArry = second.toLowerCase().toCharArray();
        Arrays.sort(firstArry);
        Arrays.sort(secondArry);
        return Arrays.equals(firstArry, secondArry);
    }

    public static boolean isAnagramsCounting(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int[] count = new int[CHARACTER_RANGE];
        for (int i = 0; i < first.length(); i++) {
            count[first.toLowerCase().charAt(i)]++;
            count[second.toLowerCase().charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
