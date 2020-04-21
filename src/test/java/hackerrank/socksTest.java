package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class socksTest {

    @Test
    public void sockMerchant() {
        int num_socks = 9;
        int[] socks = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(Socks.sockMerchant(num_socks, socks));
    }
}