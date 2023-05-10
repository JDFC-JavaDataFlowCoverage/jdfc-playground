package com.jdfc;

public class BranchingInteger {

    public int max(int a, int b) {
        int result = 0;
        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }

    public int foo(int x) {
        if (x > 3) {
            return x;
        } else {
            return x + 1;
        }
    }

    public int callFoo(int bar) {
        return foo(bar);
    }

    public int loop() {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result++;
        }
        return result;
    }

    public int test() {
        // int x 
        //
        // x = private method call where x is not redefined
    }
}
