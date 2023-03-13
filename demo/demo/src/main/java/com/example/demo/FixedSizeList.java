package com.example.demo;

public class FixedSizeList {
    private Object[] items = new Object[5];

    public void add(Object object) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = object;
                break;
            }
        }
    }

    public Object get(final int index) {
        return items[index];
    }
}
