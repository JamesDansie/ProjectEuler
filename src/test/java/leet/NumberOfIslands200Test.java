package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslands200Test {

    @Test
    public void numIslands() {
        char[][] input = {
                {'1','1','1','0','1'},
                {'1','1','0','0','1'},
                {'1','0','0','1','1'}
        };
        assertEquals("Input has two islands",
                2,
                NumberOfIslands200.numIslands(input));
    }
}