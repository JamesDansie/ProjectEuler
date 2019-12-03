import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void goodCase() {
        assertEquals("For the first 10, the equal numbers " +
                "are 2, 8, and 34. Total will be 44.",
                44,
                Problem2.fib(90));
    }

    @Test
    public void bigNum() {
        assertEquals("The sum of even numbers less than 4,000,000",
                4613732,
                Problem2.fib(4000000));
    }
}