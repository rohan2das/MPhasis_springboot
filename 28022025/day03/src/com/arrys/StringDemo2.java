package com.arrys;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		String str5 = "hello";
		//checking the reference
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println(str2==str4);
		System.out.println(str1==str5);
		System.out.println(str3==str5);
		//checking the value
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str5));
		
		String str6 = str1.concat(" version 21");
		System.out.println(str6);
	}
}
