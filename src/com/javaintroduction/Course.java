package com.javaintroduction;

public class Course {
	static int courseid;
	static String coursename;
	int studentid;
	String studentname;

	public static void main(String[] args) {
		System.out.println("welcome back to Java full stack course students");
		System.out.println("********************************************");
		courseid=1;
		coursename="java full stack";
		Course a=new Course();
		a.studentid=1;
		a.studentname="abhi";
		System.out.println("courseid:"+courseid);
		System.out.println("course name:"+coursename);
		System.out.println("student id:"+a.studentid);
		System.out.println("student name:"+a.studentname);
		System.out.println("********************************************");
		Course b=new Course();
		b.studentid=2;
		b.studentname="sita";
		System.out.println("courseid:"+courseid);
		System.out.println("course name:"+coursename);
		System.out.println("student id:"+b.studentid);
		System.out.println("student name:"+b.studentname);
		System.out.println("********************************************");
		
		Course c=new Course();
		c.studentid=3;
		c.studentname="sathya";
		courseid=2;
		coursename="jfs";
		System.out.println("courseid:"+courseid);
		System.out.println("course name:"+coursename);
		System.out.println("student id:"+c.studentid);
		System.out.println("student name:"+c.studentname);
		System.out.println("********************************************");
		
		Course d=new Course();
		d.studentid=4;
		d.studentname="sasi";
		System.out.println("courseid:"+courseid);
		System.out.println("course name:"+coursename);
		System.out.println("student id:"+d.studentid);
		System.out.println("student name:"+d.studentname);
		System.out.println("********************************************");
		
		

	}

}
