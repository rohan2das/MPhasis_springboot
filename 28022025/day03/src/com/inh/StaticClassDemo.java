package com.inh;

class MachineData{
	static int id =101;
	int pin = 600125;
	static class InnerClass1{
		void display() {
			System.out.println("static inner class"+id);
		}
	}
	class InnerClass2{
		void show() {
			System.out.println("non-static inner class"+pin);
		}
	}
}

public class StaticClassDemo {
	public static void main(String[] args) {
		MachineData.InnerClass1 obj1 = new MachineData.InnerClass1();
		obj1.display();
		MachineData obj2 = new MachineData();
		
		
		
		MachineData.InnerClass2 obj3= new obj2.InnerClass2();
}
