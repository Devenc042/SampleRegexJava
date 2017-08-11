package com.atif.java.regex.test;

import com.atif.java.regex.solution.Regex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * File to write test cases for {@link Regex} class
 */
public class RegexTest {

    private Regex regex;

    @Before
    public void setUp() throws Exception {
        regex = new Regex();
    }

    @Test
    public void isMatching() throws Exception {
        assertFalse(regex.isMatching("Hello"));
        assertTrue(regex.isMatching("Hello World."));
        assertFalse(regex.isMatching(null));
    }

    @Test
    public void matchString() throws Exception {
        regex.matchString("hello");
        regex.matchString(null);
    }

}