package com.week4.iterator;

import java.util.Iterator;

public class NewYorkStoreIterator implements Iterator {
    CakeDetails[] catalog;
    int position = 0;

    public NewYorkStoreIterator(CakeDetails[] catalog) {
        this.catalog = catalog;
    }



    @Override
    public boolean hasNext() {
        if (position >= catalog.length || catalog[position] == null) {
            return false;

        }else {
            return true;
        }

    }

    @Override
    public Object next() {
        CakeDetails cakeDetails = catalog[position];
        position = position + 1;

        return cakeDetails ;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Can't remove item");
        }
        if (catalog[position-1] == null) {
            for (int i = position-1; i < (catalog.length - 1); i++) {
                catalog[i] = catalog[i+1];
            }
            catalog[catalog.length - 1] = null;
        }
    }
}
