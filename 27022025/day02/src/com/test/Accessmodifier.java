package com.test;
import p1.Exp1;

class Exp5 extends Exp1{
	public void disp() {
//		System.out.println(pin);	//private
//		System.out.println(phone);	//having default
		System.out.println(wifip);
		System.out.println(citypin);
		
	}
}

public class Accessmodifier {
	public static void main(String[] args) {
		Exp5 obj = new Exp5();
		obj.disp();
				
	}
}
