import org.junit.Test;

import static org.junit.Assert.*;

public class Problem6Test {

    @Test
    public void NormalCase() {
        assertEquals("the given case is 2640",
                2640,
                Problem6.SumSquareDifference(1, 10));
    }
}