package com.arrys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "java: hello this is string session";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
		
		sb = null;
		
		List<String> reverseData = new ArrayList<>();
		String[] str1 = str.split(" ");
		for(String it: str1) {
			reverseData.add(it);
		}
		Collections.reverse(reverseData);
		System.out.println(reverseData);
	}
}
