package com.saco;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetMessage() {
        App app = new App();
        assertEquals("Hello, SonarQube!", app.getMessage());
    }
}

