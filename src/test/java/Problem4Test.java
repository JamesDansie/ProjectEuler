import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test {

    @Test
    public void baseCase() {
        assertEquals("From the given case this will be 9009",
                9009,
                Problem4.largestPalindrome(2));
    }

    @Test
    public void tripleDigit(){
        assertEquals("Something really big",
                906609,
                Problem4.largestPalindrome(3));
    }

    @Test
    public void isPalindrome() {
        assertTrue("This is a palindrome",
                Problem4.isPalindrome(9009));
    }

    @Test
    public void PalindromeCheckTrue(){
        assertTrue("this is a palindrome",
                Problem4.isPalindrome(131));
    }

    @Test
    public void PalindromeCheckFail(){
        assertFalse("Not a palidome",
                Problem4.isPalindrome(123));
    }
}