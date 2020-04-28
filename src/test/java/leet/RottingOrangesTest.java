package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class RottingOrangesTest {

    @Test
    public void orangesRotting() {
        int[][] grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        RottingOranges solver = new RottingOranges();
        assertEquals("the answer is 4",
                4,
                solver.orangesRotting(grid));
    }

    @Test
    public void weirdGrid() {
        int[][] grid = new int[][]{
                {1}, {2}, {1}, {1}
        };
        RottingOranges solver = new RottingOranges();
        assertEquals("the answer is 2",
                2,
                solver.orangesRotting(grid));
    }
}