package com.week4.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ChicagoStoreIterator implements Iterator {
    ArrayList<CakeDetails> catalog;
    int position = 0;

    public ChicagoStoreIterator(ArrayList<CakeDetails> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if (position >= catalog.size() || catalog.get(position) == null) {
            return false;

        }else return true;
    }

    @Override
    public Object next() {
        CakeDetails cakeDetails = catalog.get(position);
        position = position + 1;

        return cakeDetails;
    }
}
