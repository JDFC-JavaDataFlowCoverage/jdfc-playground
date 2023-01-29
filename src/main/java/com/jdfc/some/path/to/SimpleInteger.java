package com.jdfc.some.path.to;

public class SimpleInteger {

    public int foo() { // is this a comment:
        int a = 23;
        int b = 42;
        int c = a + b;
        b = 12;
        // and another one
        int d = b - c;
        return c * b / d;
    }
}
