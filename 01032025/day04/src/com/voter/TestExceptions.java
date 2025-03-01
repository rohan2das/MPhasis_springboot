package com.voter;

import java.util.Scanner;

public class TestExceptions {
	public static void main(String[] args) throws ValidAgeException, InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		AgeValidater obj = new AgeValidater();
		obj.checkAge(age);
		
	}
}
