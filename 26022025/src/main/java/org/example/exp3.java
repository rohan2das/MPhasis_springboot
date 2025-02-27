package com.test;

public class exp3 {

    public void calculate(int x, int y){
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        exp3 obj = new exp3();
        obj.calculate(10,2);
    }
}