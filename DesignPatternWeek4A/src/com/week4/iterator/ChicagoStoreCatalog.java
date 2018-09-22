package com.week4.iterator;

import com.week4.iterator.ChicagoStoreIterator;

import java.util.ArrayList;

public class ChicagoStoreCatalog {
    private ArrayList<CakeDetails> catalog;

    public ChicagoStoreCatalog() {
        catalog = new ArrayList<>();

        //Chicago cake catalog
        addItem("Chicago cake base", "plus chocolate spread", 15.20);
        addItem("Chicago cake base", "plus vanilla", 11.30);
        addItem("Chicago cake base", "plus chocolate and mint", 12.30);
        
    }



    public void addItem(String name, String description, double price) {
        CakeDetails cakeDetails = new CakeDetails(name, description, price);
        catalog.add(cakeDetails);
    }

    public ArrayList<CakeDetails> getCatalog() {
        return catalog;
    }

    public ChicagoStoreIterator createIterator() {
        return new ChicagoStoreIterator(catalog);
    }
}
