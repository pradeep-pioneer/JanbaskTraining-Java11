package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prade on 8/9/2017.
 */
public class Library {
    private List resources = new ArrayList();
    @SuppressWarnings("unchecked")
    public void addMedia(Media x) { resources.add(x); }
    public Media retrieveLast() {
        int size = resources.size();
        if (size > 0) { return (Media) resources.get(size - 1); }
        return null;
    }
}
