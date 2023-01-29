package com.jdfc.some.path;

public class GCD {

    public int calculateGCD(int x, int y) {
        int tmp = 0;
        while (y != 0) {
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
