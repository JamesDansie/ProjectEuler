package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        String inputStr = "aba";
        long inputLong = 10;

        long ans = RepeatedString.repeatedString(
                inputStr,
                inputLong
        );

        System.out.println(ans);
    }
}