package com.jdfc;

import org.junit.Test;

import java.util.UUID;

import static junit.framework.TestCase.assertTrue;

public class ClassDataTest {

    @Test
    public void testAddValue() {
        ClassData subject = new ClassData();
        String expected = UUID.randomUUID().toString();
        ClassData.track(expected);
        assertTrue(subject.getTestData().containsKey(expected));
    }
}
