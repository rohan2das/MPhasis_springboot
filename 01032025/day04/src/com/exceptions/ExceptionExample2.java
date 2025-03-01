package com.exceptions;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
			System.out.println(20/0);
		} catch (Exception e) {
			// TODO: handle exception
			//getMesage() only gives exception message
			System.out.println(e.getMessage());
			//gives exception class name and message
			System.out.println(e);
			//printStackTrace() will give class name, message and line number
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}
}
