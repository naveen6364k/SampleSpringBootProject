package com.sample.Service;


import java.util.ArrayList;
import java.util.List;

import com.sample.Entity.Employee;

/**
 * 
 * @author Naveen
 *
 */
public class EmployeeService {
	
	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();
		al.add("NeoSoft");
		al.add("webWerks");
		al.add("India");
		
		System.out.println("list of element before Iteration with foreach Loop : " + al);
		
		//Iterate the elements with for Loop 
		al.forEach(alList -> System.out.println(alList));
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Naveen"));
		employee.add(new Employee(2, "Mohal"));
		employee.add(new Employee(3, "Yugnadar"));
		
		System.out.println("The employee object ciontains" + employee);
		
		//Object Iteration with forEach loop
		employee.forEach(employeeList -> System.out.println(employeeList));
 	}

}
