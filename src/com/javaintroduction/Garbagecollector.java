package com.javaintroduction;

public class Garbagecollector {
	@Override
	protected void finalize()  {
		System.out.println("finalize method called");
	}
	int a;
	
	void hi()
	{
		System.out.println("hi method started");
		Garbagecollector c=new Garbagecollector();// object inside the method
		System.out.println("hi method ended");

		
	}

	public static void main(String[] args) {
		Garbagecollector a1=new Garbagecollector();
		/*a1.a=10;
		System.out.println(a1);//1dbd16a6
		System.out.println("Instance variable accessing:"+a1.a);*/
		Garbagecollector a2=new Garbagecollector();
		//System.out.println(a2);//251a69d7
		a2=null;
		a2=a1;//Re-assigning the values
		System.out.println(a2.a=20);
		
		
		
		
		/*a2=null;
		Garbagecollector a4=new Garbagecollector();
		a4.hi();//method inside object
		a1=null;//Nullifying the objects*/
		
		/*new  Garbagecollector().a=20;//anonimous 
		
		System.out.println(a1);
		System.out.println(a2);*/
		System.gc();

	}

}
