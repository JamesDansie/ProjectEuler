package projecteuler;

import org.junit.Test;
import projecteuler.Problem5;

import static org.junit.Assert.*;

public class Problem5Test {

    @Test
    public void isPrime() {
        assertTrue("7 is prime",
                Problem5.isPrime(7));
    }

    @Test
    public void isNotPrime(){
        assertFalse("4 is not prime",
                Problem5.isPrime(4));
    }

    @Test
    public void givenCase(){
        assertEquals("For the given case of 1 to 10 the answer is 2520",
                2520,
                Problem5.smallestMultiple(1,10));
    }
}