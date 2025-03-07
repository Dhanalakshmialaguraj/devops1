package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class maintest {
    private main main;

    @Before // This runs before each test
    public void setUp() {
        main = new main();
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, Jenkins!", main.greet());
    }
}

