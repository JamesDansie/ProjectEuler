package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class CloudsTest {

    @Test
    public void jumpingOnClouds() {
        int[] input = new int[]{0,0,1,0,0,1,0};
        int ans = Clouds.jumpingOnClouds(input);

        assertEquals("Should be 4",
                4,
                ans);
    }
}