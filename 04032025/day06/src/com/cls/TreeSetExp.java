package com.cls;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExp {
	public static void main(String[] args) {
//		Collection data = new TreeSet<>();
//		Set Data = new TreeSet<>();
		
		//data is stored in ascending order. capital letter before small
		TreeSet<String> data = new TreeSet<>();
		data.add("java");
		data.add("hello");
		data.add("R");
		data.add("java");
		data.add("100");
		data.add("spring");
		data.add("Boot");
		data.add("JAVA");
		
		System.out.println(data.reversed());
		
		Iterator itr = data.iterator();
//		while(itr.hasNext()) {
//				System.out.println(itr.next());
//		}
		
		data.forEach(d->System.out.println(d));
		
		System.out.println(data.subSet("JAVA", "spring"));
		System.out.println(data.last());
		System.out.println(data);
	}
}
