package com.javaintroduction;

public class Institute {
	static String TrainerName1="Abhi";
	static String TrainerName2="Sita";
	String EmpName;
	String EmpId;
	String EmpDesignation;
	public static void main(String[] args) {
		Institute ravi=new Institute();
		ravi.EmpName="Ravi";
		ravi.EmpId="E1";
		ravi.EmpDesignation="Teaching";
		System.out.println("Trainer one name:");
		
		Institute renu=new Institute();
		renu.EmpName="Renu";
		renu.EmpId="E2";
		renu.EmpDesignation="Non-Teaching";
		
		Institute reethu=new Institute();
		reethu.EmpName="Reethu";
		reethu.EmpId="E3";
		reethu.EmpDesignation="Non-Teaching";
		
		Institute siva=new Institute();
		siva.EmpName="Siva";
		siva.EmpId="E4";
		siva.EmpDesignation="Teaching";
		
		
	}

}
