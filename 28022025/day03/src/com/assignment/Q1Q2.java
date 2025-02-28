package com.assignment;

import java.util.ArrayList;

public class Q1Q2 {
	ArrayList<Integer> arr = new ArrayList<>();
	Q1Q2(){
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
	
	ArrayList<Integer> reverse(){
		ArrayList<Integer> res = new ArrayList<>();
//		System.out.println(arr.size());
		for(int i=arr.size()-1;i>=0;i--) {
			res.add(arr.get(i));
		}
		return res;
	}
	int maxA() {
		int res = -2147483648;
		for(int it:arr) {
			if(res<it) {
				res =it;
			}
		}
		return res;
	}
	
	int minA() {
		int res = 2147483647;
		for(int it:arr) {
			if(res>it) {
				res =it;
			}
		}
		return res;
	}
	
	//Q2: even numbers to left and odd numbers to right
	ArrayList<Integer> leftRight(){
		ArrayList<Integer> evenLeft= new ArrayList<>();
		ArrayList<Integer> oddRight= new ArrayList<>();
		for(int it:arr) {
			if(it%2==0) {
				evenLeft.add(it);
			}
			else {
				oddRight.add(it);
			}
		}
		evenLeft.addAll(oddRight);
		return evenLeft;
	}
	
	public static void main(String[] args) {
		Q1Q2 obj = new Q1Q2();
		//Q1
		ArrayList<Integer> reversed=obj.reverse();
		System.out.println("Before reversing"+obj.arr);
		System.out.println("After reversing"+reversed);
		System.out.println("Maximum");
		System.out.println(obj.maxA());
		System.out.println("Minimum");
		System.out.println(obj.minA());
		
		//Q2
		System.out.println("even numbers to the left and odd numbers to right ");
		System.out.println(obj.leftRight());
	}
}
