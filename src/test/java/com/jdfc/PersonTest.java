package com.jdfc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    @Test
    public void testConstructor() {
        Person subject = new Person("Bert", 1);
        assertEquals(subject.getName(), "Bert");
        assertEquals(subject.getAge(), 1);
    }
}
