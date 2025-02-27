package com.test;

import java.util.Scanner;

public class exp8 {
    double add(double x, double y){
        return x+y;
    }
    double sub(double x, double y){
        return x-y;
    }
    double mul(double x, double y){
        return x*y;
    }
    double div(double x, double y){
        return x/y;
    }
    public static void main(String[] args) {
        exp8 obj = new exp8();
        Scanner sc = new Scanner(System.in);
        // System.out.print("first number: ");
        double num1 = sc.nextDouble();
        // System.out.print("second number: ");
        System.out.print("Choose operand(+, -, *, /)");
        String operator = sc.next();
        double num2 = sc.nextDouble();
        switch (operator) {
            case "+":
                System.out.println(obj.add(num1, num2));
                break;
            case "-":
                System.out.println(obj.sub(num1, num2));
                break;
            case "*":
            System.out.println(obj.mul(num1, num2));
                break;
            case "/":
            System.out.println(obj.div(num1, num2));
                break;
            default:
            System.out.println("wrong input");
                break;
        }
    }
}
