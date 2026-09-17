package com.javaintroduction;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Hi This is my first java Program");
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		

	}

}
