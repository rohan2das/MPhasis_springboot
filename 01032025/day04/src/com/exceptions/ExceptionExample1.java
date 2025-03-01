package com.exceptions;

public class ExceptionExample1 {
	public static void main(String[] args) {		
		try {
			System.out.println("hello");
			int[] arr = {10, 20, 25, 30, 311};
			System.out.println(10/2);
//			System.out.println(arr[5]);
			String name = "reporting to work on saturday!!!";
			System.out.println(name.charAt(32));
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("check array index");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("be arithmetically right");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index not in range");
		}
	}
}
