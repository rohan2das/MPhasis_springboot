package com.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

public class CollectionsTest {
	
//	@Test
//	public void testListOfNumbers() {
//		List<Integer> listNum = Arrays.asList(1,10,20,30,40,50,60);
//		List<Integer> expctdData = Arrays.asList(1,10,20,30,40,50,60);
//		
//		assertEquals(expctdData, listNum);
//		
//		assertThat(listNum, is(expctdData));
//		
//		assertThat(listNum, hasItem(20));
//		
//		assertThat(listNum.size(), is(7));
//		
//		assertThat(listNum, IsEmptyCollection.empty());	
//	}
	
	@Test
	public void testCollectionObjects() {
		List<Fruits> listFruits = Arrays.asList(
				new Fruits("banana", 5),
				new Fruits("apple", 30),
				new Fruits("orange", 50),
				new Fruits("mango", 40));
		
		assertThat(listFruits, hasItem(new Fruits("orange", 50)));
	}
}
