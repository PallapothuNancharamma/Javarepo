package com.javaintroduction;

public class Student {
	static String collageName="sviet";
	/*String studentname="abhi";
	int studentid=12;
	int studentmarks=75;*/
	public static void main(String[] args) {
		String collageName="vcube";
		Student a=new Student();
		System.out.println("access static variables collage Name:"+collageName);
		System.out.println("access local variable collage name:"+Student.collageName);		
		System.out.println("access local variable collage name:"+collageName);//local variable accessed
		/*System.out.println("collage Name:"+Student.collageName);
		Student o=new Student();
		System.out.println("Student name:"+o.studentname);
		System.out.println("Studentid:"+o.studentid);
		System.out.println("Student marks:"+o.studentmarks);   
		https://github.com/srikanthjava91
		*/
		

	}

}
