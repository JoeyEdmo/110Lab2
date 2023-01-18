package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilitiesTest {
    @Test
    public void utest(){
        assertEquals("1.2", Utilities.trimDisplayStr("1.20"));
        assertEquals("1.234", Utilities.trimDisplayStr("1.2340"));
    }
}
