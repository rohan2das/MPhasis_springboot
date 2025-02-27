package com.test;

import java.util.Scanner;

public class exp10 {

	public static void main(String[] args) {
		System.out.println("Using for loop printing even numbers from 1 to 10");
		for(int i =1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Using while loop printing odd numbers from 1 to 10");
		int c = 1;
		while(c<=10) {
			
			if(c%2 != 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println();
		System.out.print("Put a integer number: ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		if(x%2 ==0) {
			System.out.println("It is an even number");
		}
		else{
			System.out.println("It is an odd number");
		}
	}

}
