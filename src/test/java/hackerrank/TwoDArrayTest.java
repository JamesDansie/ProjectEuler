package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDArrayTest {

    @Test
    public void hourglassSum() {
        int[][] inputArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        assertEquals("answer is 19",
                19,
                TwoDArray.hourglassSum(inputArray));
    }
}