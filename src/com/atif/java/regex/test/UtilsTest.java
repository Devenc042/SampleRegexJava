package com.atif.java.regex.test;

import com.atif.java.regex.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * utility file to perform common tasks throughout the program
 */
public class UtilsTest {
    @Test
    public void shouldExit() throws Exception {
        assertTrue(Utils.shouldExit("exit"));
        assertFalse(Utils.shouldExit(null));
        assertFalse(Utils.shouldExit("don't exit"));
    }

}