package com.week4.iterator;

import java.util.Iterator;

// This might be the menu...
public class NewYorkChicagoShop {
  
	ChicagoStoreCatalog chicagoStoreCatalog;
	NewYorkStoreCatalog newYorkStoreCatalog;

    public NewYorkChicagoShop(ChicagoStoreCatalog chicagoStoreCatalog, NewYorkStoreCatalog newYorkStoreCatalog) {
        this.chicagoStoreCatalog = chicagoStoreCatalog;
        this.newYorkStoreCatalog = newYorkStoreCatalog;
    }
    
    

    public void printCatalog() {
        ChicagoStoreIterator chicagoStoreIterator = chicagoStoreCatalog.createIterator();
        System.out.println("Printing Chicago Cake List: ");
        printCatalog(chicagoStoreIterator);


        System.out.println("\nPrinting New York Cake List: ");

        NewYorkStoreIterator newYorkStoreIterator = newYorkStoreCatalog.createIterator();
        printCatalog(newYorkStoreIterator);

    }

    
    // Catalog section
   private void printCatalog(NewYorkStoreIterator iterator) {
        while (iterator.hasNext()) {
            CakeDetails cakeDetails = (CakeDetails)iterator.next();
            System.out.print(cakeDetails.getName() + ", ");
            System.out.print(cakeDetails.getDescription() + " ");
            System.out.println(cakeDetails.getPrice());
        }
    }
    
    
    private void printCatalog(ChicagoStoreIterator iterator) {
        while (iterator.hasNext()) {
            CakeDetails cakeDetails = (CakeDetails)iterator.next();
            System.out.print(cakeDetails.getName() + ", ");
            System.out.print(cakeDetails.getDescription() + " ");
            System.out.println(cakeDetails.getPrice());
        }

    }
}
