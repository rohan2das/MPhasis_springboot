package com.test;

import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("not elligible");
        }
        else if(age==18){
            System.out.println("just elligible");
        }
        else{
            System.out.println("elligible");
        }
    }
}
