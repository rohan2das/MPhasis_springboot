package com.arrys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp1 {
	
	public boolean validEmail(String email) {
		return (Pattern.matches("[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]*)*", email));
	}
	
	public boolean validPass(String pass) {
		String patternP="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%&?])(?=\\S+$).{12,}";
		return Pattern.matches(patternP, pass);
	}
	
	public static void main(String[] args) {
//		Pattern formatD = Pattern.compile(".s");
//		Matcher matchD = formatD.matcher("dfjd");
//		boolean b = matchD.matches();
//		System.out.println(b);
//		
//		boolean b1= Pattern.compile(".s").matcher("bs").matches();
//		System.out.println(b1);
//		
//		boolean b2 = Pattern.matches("..s", "cas");
//		System.out.println(b2);
//		
//		System.out.println(Pattern.matches("[abc]", "d"));
//		
//		System.out.println(Pattern.matches("[6-9]{1}[0-9]{9}", "6142568525"));
//		
//		System.out.println();
//		
//		
		
		RegexExp1 obj = new RegexExp1();
		System.out.println(obj.validEmail("rohan.das@example.com"));
		System.out.println(obj.validPass("Rohan@123456789"));
		
		
	}
}
