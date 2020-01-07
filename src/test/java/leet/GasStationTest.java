package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GasStationTest {
    int[] gas = new int[]{1,2,3,4,5};
    int[] cost = new int[]{3,4,5,1,2};

    @Test
    public void canCompleteCircuit() {
        assertEquals("Starting point is 3",
                3,
                GasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void startingPoint() {

        assertEquals("starting point is 3rd index",
                3,
                GasStation.startingPoint(0,gas,cost));
    }

    @Test
    public void morestuff(){
        int[] gas = new int[]{5,1,2,3,4};
        int[] cost = new int[]{4,4,1,5,1};

        assertEquals("Answer should be 4",
                4,
                GasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void shortie(){
        int[] gas = new int[]{2};
        int[] cost = new int[]{2};

        assertEquals(0,
                GasStation.canCompleteCircuit(gas,cost));
    }
}