package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Exp4 {
	public static void main(String[] args) {
		ArrayList<String> listNames = new ArrayList<>();
		listNames.add("java");
		listNames.add("j");
		listNames.add("spring");
		listNames.add("Angular");
		listNames.add("Rohan");
//		listNames.add(null);
		listNames.add("Das");
		
		System.out.println(listNames);
		
		Iterator<String> itr = listNames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<String> listItr = listNames.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		for(String strItr:listNames) {
			System.out.println(strItr);
		}
		
		Collections.sort(listNames);
		System.out.println("---------------------------------");
//		for(String str:listNames) {
//			System.out.println(str);
//		}
		System.out.println(listNames);
	}
}
