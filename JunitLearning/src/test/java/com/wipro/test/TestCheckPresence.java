package com.wipro.test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testPresence() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Hello World", "World"));
        assertFalse(obj.checkPresence("Hello World", "Java"));
    }
}