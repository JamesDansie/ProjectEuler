package projecteuler;

import org.junit.Test;
import projecteuler.Problem3;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void maxPrimeFactor() {
        assertEquals("Given case of 13195 has factors of" +
                " 5, 7, 13, 29 for a max of 29",
                29,
                Problem3.maxPrimeFactor(13195));
    }

    @Test
    public void bigNumber(){
        long bigNum = 600851475143L;
        assertEquals("for a really big number",
                6857,
                Problem3.maxPrimeFactor(bigNum));
    }
}