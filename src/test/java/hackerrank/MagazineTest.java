package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagazineTest {

    @Test
    public void checkMagazine() {
        String[] mag = new String[]{"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[]{"give", "one", "grand", "today"};

        Magazine.checkMagazine(mag, note);
    }
}