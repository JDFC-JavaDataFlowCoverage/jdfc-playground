package com.jdfc.interprocedural;

import org.checkerframework.checker.units.qual.C;

public class Construct {

    public void callConstructor() {
        NonPrimitives a = new NonPrimitives();
        System.out.println(a);
    }

    public static Construct create() {
        return new Construct();
    }
}
