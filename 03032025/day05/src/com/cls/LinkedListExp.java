package com.cls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExp {

	public static void main(String[] args) {
//		Collection data = new ArrayList();
//		List data = new ArrayList();
		LinkedList data = new LinkedList();
		
		data.add(10);
		data.add("java");
		data.add(20);
		data.add(22.24f);
		data.add(15.64d);
		data.add(398347972l);
		data.add('R');
		data.add(true);
		System.out.println(data);
		System.out.println(data.size());
		
		data.set(5, 2629311l);
		System.out.println(data);
		
		data.remove(4);
		System.out.println(data);
		System.out.println(data.get(4));

		System.out.println(data.indexOf('R'));
		System.out.println(data.getFirst());
		
		//Iterator for all types of datatype
//		Iterator it =data.iterator();
		
		//ListIterator is only for list datatype
		ListIterator it =data.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
//		for(Object obj:data) {
//			System.out.println(obj);
//		}
		
		
	}
}
