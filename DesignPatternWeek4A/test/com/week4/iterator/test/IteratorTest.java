package com.week4.iterator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.week4.iterator.ChicagoStoreCatalog;
import com.week4.iterator.NewYorkChicagoShop;
import com.week4.iterator.NewYorkStoreCatalog;

public class IteratorTest {

	// Test for New York Strawberry and Chocolate cake iterators
		@Test
		public void checkNYCakeCommands() {
			
			//New york and Chicago objects
			NewYorkStoreCatalog newYorkStoreCatalog = new NewYorkStoreCatalog();  
	    	ChicagoStoreCatalog chicagoStoreCatalog = new ChicagoStoreCatalog();

	    	//NY and Chicago combined 
	        NewYorkChicagoShop newYorkChicagoShop = new NewYorkChicagoShop(chicagoStoreCatalog, newYorkStoreCatalog);
	        newYorkChicagoShop.printCatalog();

		}
		
	
}
