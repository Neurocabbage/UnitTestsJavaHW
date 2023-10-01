package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    @Test
    public void testEvenNumber() {
        assertTrue(MainHW.evenOddNumber(2));
        assertTrue(MainHW.evenOddNumber(10));
        assertTrue(MainHW.evenOddNumber(100));
    }

    @Test
    public void testOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
        assertFalse(MainHW.evenOddNumber(15));
        assertFalse(MainHW.evenOddNumber(101));
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(MainHW.numberInInterval(26));
        assertTrue(MainHW.numberInInterval(99));
        assertFalse(MainHW.numberInInterval(25));
        assertFalse(MainHW.numberInInterval(100));
        assertFalse(MainHW.numberInInterval(10));
        assertFalse(MainHW.numberInInterval(200));
    }


}

