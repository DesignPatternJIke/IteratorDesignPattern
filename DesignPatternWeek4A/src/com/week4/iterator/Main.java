package com.week4.iterator;

import com.week4.iterator.Catalog;
import com.week4.iterator.NewYorkChicagoShop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    	NewYorkStoreCatalog newYorkStoreCatalog = new NewYorkStoreCatalog();  	
    	ChicagoStoreCatalog chicagoStoreCatalog = new ChicagoStoreCatalog();



        NewYorkChicagoShop newYorkChicagoShop = new NewYorkChicagoShop(chicagoStoreCatalog, newYorkStoreCatalog);
        newYorkChicagoShop.printCatalog();


    }
}
