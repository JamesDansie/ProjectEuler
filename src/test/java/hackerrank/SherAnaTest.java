package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class SherAnaTest {

    @Test
    public void sherlockAndAnagrams() {
        String input = "ifailuhkqq";
        assertEquals("Should be 3",
                3,
                SherAna.sherlockAndAnagrams(input));
    }
}