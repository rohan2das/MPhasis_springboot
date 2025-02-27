package com.test;

import java.util.Scanner;

public class exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        int height = sc.nextInt();
        System.out.print("Weight: ");
        int weight  = sc.nextInt();
        System.out.print("Age: ");
        int age = sc.nextInt();
        if(age>=22){
            if (weight>=55 && weight <=65) {
                if(height>170){
                    System.out.println("Application submitted successfully");
                }
                else{
                    System.out.println("heigth not sufficient");
                }
            }
            else{
                System.out.println("weight not in range");
            }
        }
        else{
            System.out.println("underaged!!!");
        }
    }
}
