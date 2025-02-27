package com.test;

public class exp2 {
    //method taking the args and returning the value
    public int method1(int x, String y){
        System.out.println( "method 1");
        return 10;
    }

    //method not taking args and not returning the value
    public void method2(){
        System.out.println("method2");
    }
    
    //method taking the args but not returning the value
    public void method3(String name){
        System.out.println("method 3");
    }

    //method not taking the arguments but returning the value 
    public String method4(){
        System.out.println("method4");
        return "hello";
    }

    public static void main(String[] args) {
        exp2 obj = new exp2();
        obj.method1(11, "abc");
        obj.method2();
        obj.method3("def");
        obj.method4();
    }
}
