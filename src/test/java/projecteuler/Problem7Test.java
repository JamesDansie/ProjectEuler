package projecteuler;

import org.junit.Test;
import projecteuler.Problem7;

import static org.junit.Assert.*;

public class Problem7Test {

    @Test
    public void nthPrime() {
        assertEquals("The 3rd prime number is 5",
                5,
                Problem7.nthPrime(3));
    }

    @Test
    public void bigPrime(){
        assertEquals("The 10001 prime is 104743",
                104743,
                Problem7.nthPrime(10001));
    }
}