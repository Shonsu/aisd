package pl.shonsu.palindrome;

import static pl.shonsu.palindrome.Palindrome.longestPalindrome;

public class Main {
    public static void main(String[] args) {

        String str = "aba1234321abcdefg";

//        System.out.println("Palindrome:\t" + Arrays.toString(arr));
//
//        boolean test = checkIfPalindrome(arr);
//
//        System.out.println("Is palindrome: " + test);
//
//        System.out.println(checkIfPalindrome2(String.valueOf(arr)));

        System.out.println(longestPalindrome(str));
    }


}
