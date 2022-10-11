package pl.shonsu.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pl.shonsu.palindrome.Palindrome.checkIfPalindrome;
import static pl.shonsu.palindrome.Palindrome.reversePalindrome;

class PalindromeTest {

    @Test
    void checkEvenElementsArrayIfPalindrome() {
        //given
        char[] arr = new char[]{'a', 's', 'd', '1', '1', 'd', 's', 'a'};
        //when
        boolean result = checkIfPalindrome(arr);
        //then
        assertTrue(result);
    }

    @Test
    void checkOddElementsArrayIfPalindrome() {
        //given
        char[] arr = new char[]{'a', 's', 'd', '1', 'Z', '1', 'd', 's', 'a'};
        //when
        boolean result = checkIfPalindrome(arr);
        //then
        assertTrue(result);
    }


    @Test
    void reverseEvenPalindrome() {
        //given
        char[] arr = new char[]{'a', 's', 'd', '1', '1', 'd', 's', 'a'};
        //when
        reversePalindrome(arr, 0);
        //then
        assertArrayEquals(new char[]{'1', 'd', 's', 'a', 'a', 's', 'd', '1'}, arr);
    }


    @Test
    void reverseOddPalindrome() {
        //given
        char[] arr = new char[]{'a', 's', 'd', '1', 'G', '1', 'd', 's', 'a'};
        //when
        reversePalindrome(arr, 0);
        //then
        assertArrayEquals(new char[]{'1', 'd', 's', 'a', 'G', 'a', 's', 'd', '1'}, arr);
    }
}