package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewYearsChaosTest {

    @Test
    public void minimumBribes() {
        int[] input1 = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        int[] input2 = new int[]{1, 2, 5, 3, 7, 8, 6, 4};

        System.out.println("input 1 is;");
        NewYearsChaos.minimumBribes(input1);

        System.out.println("input 2 is;");
        NewYearsChaos.minimumBribes(input2);
    }
}