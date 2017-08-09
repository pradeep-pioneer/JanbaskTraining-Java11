package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prade on 8/9/2017.
 */
public class LibraryGeneric<E> {
    private ArrayList<E> resources = new ArrayList<E>();

    public void addMedia(E x) {
        resources.add(x);
    }

    public E retrieveLast() {
        int size = resources.size();
        if (size > 0) {
            return resources.get(size - 1);
        }
        return null;
    }
}
