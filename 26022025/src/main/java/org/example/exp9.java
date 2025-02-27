package com.test;

public class exp9 {
	public static void main(String[] args) {
//		for(int i =0; i<=10; i++) {
//			System.out.println("7 X "+i+" = "+ 7*i);
//		}
//		System.out.println("ok from sts");
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		for(int i =0; i<arr.length; i++) {
			System.out.println(i);
		}
		String[] names = {"Rohan", "Nitya", "Koushik", "Ayan", "Arghya"};
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
//		int index =names.length;
//		while(index>=0) {
//			System.out.println(names[index--]);
//		}
		int x =0;
		int l = arr.length;
		while(x<l) {
			System.out.println(arr[x]);
			x++;
		}
		l = arr.length;
		x=0;
		do {
			System.out.println(arr[x++]);
		}
		while(x<l);
		
		//for each
		for(int j:arr) {
			System.out.println(j);
		}
	}
}
