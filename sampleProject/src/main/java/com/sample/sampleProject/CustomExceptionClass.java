package com.sample.sampleProject;

public class CustomExceptionClass extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Create custom exception in constructor level
	CustomExceptionClass(int code, String exp){
		
		//Pass arguments for Exception class		
		super(exp);
		
	}
	
	

}
