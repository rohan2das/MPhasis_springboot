package com.cls;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack st = new Stack();
//		st.push(10);
//		st.push(3.14f);
//		st.push(2629311l);
//		st.push('R');
//		st.push("Rohan");
//		System.out.println(st);

		st.push(10);
		st.push(3.14f);
		st.push(2629311l);
		st.push('R');
		st.push("Rohan");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.push(15));
//		System.out.println(st.peek());
		
		System.out.println(st.pop());
		System.out.println(st.peek());

		System.out.println(st.search(1000));
		System.out.println(st.empty());
		
		//legacy feature --> enumerator
		Enumeration itr = st.elements();
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}

		st.clear();
		System.out.println(st);
		System.out.println(st.empty());
		
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}
	}
}
