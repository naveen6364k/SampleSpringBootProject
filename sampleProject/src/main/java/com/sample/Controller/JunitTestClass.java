package com.sample.Controller;

public class JunitTestClass {
	
	public int calculate(int x) {
		return x*x;
	}
	
	public int countOfWords(String name) {
		int count = 0;
		if(name.contentEquals("k")) {
			count++;
		}
		
		return count;
	}

}
