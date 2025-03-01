package com.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

class User{
	private String name;
	private String email;
	private String pass;
	
	public User(String name, String email, String pass) {
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', password='" + pass + "'}";
    }
}

interface UserInfo{
	void register(String name, String email, String pass);
	User getUser(String email);
}

class UserInfoImpl implements UserInfo{
	int userCount =0;
	User[] users = new User[100];
	final String passFormat = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%&?])(?=\\S+$).{12,}";
	final String emailFormat = "[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]*)*";
	public void register(String name, String email, String pass) {
		if(!Pattern.matches(emailFormat, email)) {
			System.out.println("Wrong email format");
			return;
		}
		if(!Pattern.matches(passFormat, pass)) {
			System.out.println("Wrong password format");
			return;
		}
		
		if(userCount<users.length) {
			
//			users[userCount].setEmail(email);
//			users[userCount].setName(name);
//			users[userCount].setPass(pass);
//			userCount++;
			users[userCount++]=new User(name, email, pass);
			System.out.println("user created successfully");
		}
		else {
			System.out.println("memory full");
		}
		
	}
	
	public User getUser(String email) {
		if(!Pattern.matches(emailFormat, email)) {
			System.out.println("Wrong email format");
			return null;
		}
		for(int i =0; i<userCount;i++) {
			if(users[i].getEmail().equals(email)) {
				return users[i];
			}
		}
		return null;
	}
}

public class Q3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoImpl obj = new UserInfoImpl();
		obj.register("Rohan", "rohan.das@example.com", "Rohan@123456789");
		obj.register("Prime", "prime.sleepy@example.com", "Prime@123456789");
		User foundObject= obj.getUser("rohan.das@example.com");
		System.out.println(foundObject);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, Choose from: ");
		System.out.println("1.Create User \n"
				+ "2.Find User \n"
				+ "3. Exit");
		int res = sc.nextInt();
		switch (res) {
		case 1: {
			
			System.out.print("Name: ");
			String nameResponse = sc.nextLine();
			System.out.print("E-mail: ");
			String emailResponse = sc.nextLine();
			System.out.print("Password: ");
			String passResponse = sc.nextLine();
			obj.register(nameResponse, emailResponse, passResponse);
		}
		case 2: {
			System.out.print("provide the Email: ");
			String getUserByEmail = sc.nextLine();
			obj.getUser(getUserByEmail);
		}
		case  3: {
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + res);
		}
	}

}
