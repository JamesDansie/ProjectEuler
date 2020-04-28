package projecteuler;

import org.junit.Test;
import projecteuler.Problem1;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void threeAndFiveSum() {
        assertEquals("The given problem of 10 should equal 23",
                23,
                Problem1.ThreeAndFiveSum(10));
    }

    @Test
    public void smallNum(){
        assertEquals("For 5 there should be 3+5 = 8",
                8,
                Problem1.ThreeAndFiveSum(6));
    }

    @Test
    public void bigNum(){
        assertEquals("This is a really big number",
                233168,
                Problem1.ThreeAndFiveSum(1000));
    }
}