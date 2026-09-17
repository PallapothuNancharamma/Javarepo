package com.javaintroduction;

public class Test {
	static int storeid=10;
	int a=120;
	public static int hello() {
		System.out.println("hello have a good day");
		int c=0;
		c=10+20;
		return c;
	}
	public static void hi() {
		System.out.println("hi have a good day");
	
	}

	public static void main(String[] args) {
		Test obj1=new Test();	
		System.out.println("static variable diretly:"+storeid	);//directly
		System.out.println("static variable by class name:"+Test.storeid	);//class name 
		System.out.println("static variable by object reference variable:"+obj1.storeid	);//object
		System.out.println("access the instance variable by object:"+obj1.a);//access the instace variable by using the object reference variable
		//System.out.println(a);//we can't access the instace variables directly
		System.out.println(obj1.a);//we can also innitialize values of instace variable  in variable declaration
		System.out.println(obj1.add(10,20));
		System.out.println(hello());//we can acces static methods directly ,without using object reference variables
		hi();//without return type, the method is directly called by without system.out.println() statement
		}

	public int add(int a,int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}

}
