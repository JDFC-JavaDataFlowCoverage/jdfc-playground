package com.jdfc.interprocedural;

public class Construct {

    public void callConstructor() {
        NonPrimitives a = new NonPrimitives();
        System.out.println(a);
    }

    public static Construct create() {
        return new Construct();
    }
}
