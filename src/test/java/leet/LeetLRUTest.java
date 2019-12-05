package leet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetLRUTest {

    @Test
    public void get() {
        LeetLRU cache = new LeetLRU(2);

        cache.put(1,1);
        cache.put(2,2);
        assertEquals("2 should be 2 ",
                2,
                cache.get(2));
        assertEquals("1 should be 1",
                1,
                cache.get(1));
    }

    @Test
    public void put() {
        LeetLRU cache = new LeetLRU(2);

        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        assertEquals("Contains 3",
                3,
                cache.get(3));
        assertEquals("Contains 2",
                2,
                cache.get(2));
        assertEquals("Does not contain 1",
                -1,
                cache.get(1));
    }

    @Test
    public void findIndex() {
        LeetLRU cache = new LeetLRU(2);

        cache.put(1,1);
        assertEquals("The 2nd position is open",
                1,
                cache.findIndex(4));
        cache.put(2,2);
        assertEquals("The 1st position is the last used",
                0,
                cache.findIndex(4));
    }
}