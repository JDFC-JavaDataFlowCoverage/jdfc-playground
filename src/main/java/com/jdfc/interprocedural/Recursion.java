package com.jdfc.interprocedural;

public class Recursion {

    public int recursive(int x) {
        if (x == 1) {
            return 1;
        }

        if (x < 10) {
            return 10 * x + recursive(x-1);
        } else {
            return 2 * x + recursive(x-1);
        }
    }

    public void recursiveMethod(int n) {
        if (n <= 0) {
            return;
        }

        // Call another method
        anotherMethod(n);

        // Recursive call
        recursiveMethod(n - 1);
    }

    // Another method that gets called by the recursive method
    public void anotherMethod(int n) {
        System.out.println("Another method called with value: " + n);
    }

    public int addOne(int i) {
        if (i < 100) {
            i++;
            return addTwo(i);
        } else {
            return i;
        }
    }

    public int addTwo(int i) {
        if (i < 100) {
            i += 2;
            return addThree(i);
        } else {
            return i;
        }
    }

    public int addThree(int i) {
        if (i < 100) {
            i += 3;
            return addOne(i);
        } else {
            return i;
        }
    }
}
