package com.cls;

import java.util.Iterator;
import java.util.Map.Entry;

public class TreeMap {
	public static void main(String[] args) {
		java.util.TreeMap<String, Integer> data = new java.util.TreeMap<>();
		data.put("lenovo", 300);
		data.put("sony", 450);
		data.put("lenovo", 250);
		data.put("dell", 300);
		data.put("asus", 850);
		data.put("apple", 560);
		data.put("ipad", 670);
		data.put("apple", 900);
		
		
		System.out.println(data);
		
		//using iterator
		Iterator<Entry<String, Integer>> itr = data.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Product: "+et.getKey()+" Price:"+et.getValue());
		}
		
		//enhanced for-loop
		for(String str :data.keySet()) {
			System.out.println(str+" : "+data.get(str));
		}
		
		//only values
		for(Integer x:data.values()) {
			System.out.println(x);
		}
		
		//java8 feature
		data.forEach((k, v)->System.out.println(k+" : "+v));
		
	}
}
