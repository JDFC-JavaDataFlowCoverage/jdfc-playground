package com.jdfc.some.path.to;

public class SimpleInteger {

    private int key;

    public SimpleInteger() {
        this.key = 0;
    }

    public SimpleInteger(int key) {
        this.key = key;
    }

    public int foo() { // is this a comment:
        int b = 42;
        int c = key + b;
        b = 12;
        // and another addOne
        int d = b - c;
        return c * b / d;
    }

    public void bar() {
        this.key++;
    }

    public static int chat(int a) {
        int b = 5 - a;
        int c = 2 * b + a;
        return 3*c;
    }
}
