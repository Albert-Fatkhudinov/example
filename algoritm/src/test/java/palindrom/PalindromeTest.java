package palindrom;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void checkPalindrome() {
        String word1 = "123454321";
        String word2 = "madam i’m Adam";
        String word3 = "Olson in Oslo";

        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(word1);
        palindrome.checkPalindrome(word2);
        palindrome.checkPalindrome(word3);
    }
}