package pl.shonsu.palindrome;

import java.util.Arrays;

import static pl.shonsu.palindrome.Palindrome.checkIfPalindrome;
import static pl.shonsu.palindrome.Palindrome.reversePalindrome;

public class Main {
    public static void main(String[] args) {

        String str = "";
        char[] arr = str.toCharArray();

        System.out.println("Palindrome:\t" + Arrays.toString(arr));

        boolean test = checkIfPalindrome(arr);

        System.out.println("Is palindrome: " + test);

        reversePalindrome(arr, 0);

        System.out.println("Reverse:\t" + Arrays.toString(arr));
    }


}
