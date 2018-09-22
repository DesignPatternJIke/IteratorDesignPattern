package com.week4.iterator;

import com.week4.iterator.Catalog;
import com.week4.iterator.NewYorkStoreIterator;

public class NewYorkStoreCatalog implements Catalog{
    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    CakeDetails[] catalog;

    public NewYorkStoreCatalog() {
        catalog = new CakeDetails[MAX_ITEMS];

        //Chicago cake catalog
        addItem("New York cake base", "plus chocolate spread", 20.20);
        addItem("New York  cake base", "plus vanilla", 16.30);
        addItem("New York  cake base", "plus chocolate and mint", 17.30);
    }


    public void addItem(String name, String description, double price) {
         CakeDetails cakeDetails = new CakeDetails(name, description, price);

         if (numberOfProducts >= MAX_ITEMS) {
             System.out.println("Catalog is Full - can't add products.");

         }else {
             catalog[numberOfProducts] = cakeDetails;
             numberOfProducts = numberOfProducts + 1;
         }
    }

      
    public NewYorkStoreIterator createIterator() {
        return  new NewYorkStoreIterator(catalog);
    }



}
