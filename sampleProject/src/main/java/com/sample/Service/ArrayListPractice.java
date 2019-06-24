package com.sample.Service;

public class ArrayListPractice {
	
	int a;
	String b;
	
	public static void main(String[] args) {
		int c = 1;
		String d = "Random String";
		ArrayListPractice alp = new ArrayListPractice();
		//alp.main(args);
		System.out.println(alp.a);
		System.out.println(alp.b);
		
		float u = ArrayListPractice.add(1, 2);
		
		System.out.println("value is : " + u);
		
		
	}
	
	
	static float add(float a, float b) {
		return a*b;
	}

}
