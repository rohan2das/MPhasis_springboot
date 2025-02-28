package com.assignment;

import java.util.ArrayList;

public class Q1 {
	ArrayList<Integer> arr = new ArrayList<>();
	Q1(){
		arr.add(2);
		arr.add(5);
		arr.add(240);
		arr.add(8);
		arr.add(10);
		arr.add(15);
		arr.add(311);
		arr.add(19);
		arr.add(120);
		arr.add(30);
	}
	
	ArrayList<Integer> reverse(ArrayList<Integer> arr){
		ArrayList<Integer> res = new ArrayList<>();
//		System.out.println(arr.size());
		for(int i=arr.size()-1;i>=0;i--) {
			res.add(arr.get(i));
		}
		return res;
	}
	void maxA() {

	}
	
	void minA() {
		
	}
	
	public static void main(String[] args) {
		Q1 obj = new Q1();
		ArrayList<Integer> reversed=obj.reverse(obj.arr);
		System.out.println(reversed);
	}
}
