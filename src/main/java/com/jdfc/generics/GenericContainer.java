package com.jdfc.generics;

public class GenericContainer<T> {
    private T item;

    public GenericContainer(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
