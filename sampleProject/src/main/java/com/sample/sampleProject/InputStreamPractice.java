package com.sample.sampleProject;

import java.util.Scanner;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class InputStreamPractice {

	public static String employerName = "NeoSoft";
	
   public static int employeeCode;

	public static String employeeName;

	public static void main(String[] args) {

//		public static String employerName = "NeoSoft";

		Scanner sc = new Scanner(System.in);
		
		try {
		
		for(int i=0;i <=2;i++) {
		
		employeeCode = sc.nextInt();
		
		employeeName = sc.next();
		
		}
		
		System.out.println("The employee info is" + employeeCode + " " + employeeName);

	}
		catch (Exception e) {
			
			System.out.println("Exception occured and handled" + e);
			// TODO: handle exception
		}
	}

}
