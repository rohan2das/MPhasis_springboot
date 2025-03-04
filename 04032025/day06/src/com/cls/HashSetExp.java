package com.cls;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExp {
	public static void main(String[] args) {
//		Collection data = new HashSet<>();
//		Set data = new HashSet<>();
		
//		HashSet data = new HashSet<>();		//storing order will be random
		LinkedHashSet data = new LinkedHashSet<>();	//storing order will be based on insertion
		data.add("java");
		data.add(100);
		data.add('R');
		data.add("java");
		data.add(100);
		data.add(3.14f);
		data.add(44.66d);
		data.add(true);
		
		System.out.println(data);
		
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//lambda eqn from java8
		data.forEach(x->System.out.println(x));
		
	}
}
