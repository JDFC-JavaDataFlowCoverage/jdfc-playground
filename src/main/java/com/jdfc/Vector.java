package com.jdfc;

public class Vector {
    private int[] values;
    private int rank;

    public Vector(int[] values) {
        if (values.length == 20) {
            this.values = values;
        } else {
            throw new IllegalArgumentException("Invalid vector size!");
        }
    }

    public int[] getValues() {
        return values;
    }
    public void setValues(int[] values) {
        this.values = values;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}
