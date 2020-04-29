package leet;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class CriticalConnectionsTest {

    @Test
    public void criticalConnections() {
        List<List<Integer>> input = new LinkedList<>();
        List<Integer> con1 = new LinkedList<>();
        con1.add(0);
        con1.add(1);

        List<Integer> con2 = new LinkedList<>();
        con2.add(1);
        con2.add(2);

        List<Integer> con3 = new LinkedList<>();
        con3.add(2);
        con3.add(0);

        List<Integer> con4 = new LinkedList<>();
        con4.add(1);
        con4.add(3);

        input.add(con1);
        input.add(con2);
        input.add(con3);
        input.add(con4);

        CriticalConnections solver = new CriticalConnections();
        System.out.println(solver.criticalConnections(input.size(), input));
    }
}