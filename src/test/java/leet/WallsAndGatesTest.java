package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class WallsAndGatesTest {
    @Test
    public void test(){
        int INF = Integer.MAX_VALUE;
        int[][] input = new int[][]{
                {INF, -1,  0,   INF},
                {INF, INF, INF, -1},
                {INF, -1,  INF, -1},
                {0,   -1,  INF, INF}
        };
        WallsAndGates solver = new WallsAndGates();

        solver.wallsAndGates(input);
    }

}