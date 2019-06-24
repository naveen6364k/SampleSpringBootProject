package com.sample.sampleProject;


//Custom class Syntax at class level
public class ProvideCustomException {
	
	int age= 40;
	
	public static void main(String[] args) {
		
		ProvideCustomException pcu = new ProvideCustomException();
		
		try {
			pcu.validateAge(55);
		}
		
		catch(Exception e) {
			System.out.println("Exception catched : " + e);
		}
	
	}
	
	void validateAge(int age) throws CustomExceptionClass {

		if (age > 40) {
			throw new CustomExceptionClass(200, "age is not valid");
		}
	}

}
