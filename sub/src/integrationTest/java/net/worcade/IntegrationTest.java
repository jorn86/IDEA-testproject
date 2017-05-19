package net.worcade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    @Test
    public void testThatSucceeds() {
        assertEquals(0, Example.returnZero());
    }

    @Test
    public void testThatFails() {
        assertEquals(1, Example.returnZero());
    }
}
