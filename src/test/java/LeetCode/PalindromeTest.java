package LeetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
Palindrome palindrome = new Palindrome();

    @Test
    @DisplayName("Pandloriam test 121")
    void palindromeTest121()
    {

        Assertions.assertTrue(palindrome.isPalindrome(121));
    }
    @Test
    @DisplayName("Pandloriam test 121")
    void palindromeTestNeg121()
    {

        Assertions.assertFalse(palindrome.isPalindrome(-121));
    }
    @Test
    @DisplayName("Pandloriam test 10")
    void palindromeTest10()
    {

        Assertions.assertFalse(palindrome.isPalindrome(10));
    }



}