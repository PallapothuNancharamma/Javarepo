package com.javaintroduction;

public class Employee {
	int EmpId;
	String EmpName;
	static String CompanyName;
	{
		System.out.println("hi this is instace block");
	}
	public static void main(String[] args) {
		Employee a=new Employee();
		a.EmpId=1;
		a.EmpName="abhi";
		System.out.println("emp id:"+a.EmpId);
		System.out.println("emp name:"+a.EmpName);
		
		Employee b=new Employee();
		b.EmpId=2;
		b.EmpName="seta";
		System.out.println("emp id:"+b.EmpId);
		System.out.println("emp name:"+b.EmpName);
		
		Employee c=new Employee();
		c.EmpId=3;
		c.EmpName="ravi";
		System.out.println("emp id:"+c.EmpId);
		System.out.println("emp name:"+c.EmpName);
	}
	static{
		CompanyName="Wipro";
		System.out.println("company name is:"+CompanyName);
	}
}
