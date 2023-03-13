package com.example.demo;

import java.lang.reflect.Array;

public class GenericFixedSizeList<T> {
    private T[] items;

    public GenericFixedSizeList(Class<T> clazz, int capacity) {
          this.items = (T[]) Array.newInstance(clazz, capacity);
    }

    public void add(T object) {

        if (object == null)
            throw new NullPointerException();

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null)
                items[i] = object;
        }

    }

    public T get(final int index) {
        return items[index];
    }

}
