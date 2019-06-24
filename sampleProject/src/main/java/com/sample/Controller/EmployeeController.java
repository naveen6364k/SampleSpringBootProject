package com.sample.Controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Entity.Employee;
import com.sample.Entity.EmployeeAdress;
import com.sample.Repositary.EmployeeRepositary;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeRepositary employeeRepo;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getName() {
		return "Hello Naveen";
	}

	@RequestMapping(value = "/SaveEmployeeDetails", method = RequestMethod.POST)
	public EmployeeAdress SaveEmployeeDetails(@RequestBody Employee employee) {

		try {

			if (employee != null) {
				System.out.println("values mapped successfuylly and employee object is" + employee);
				employeeRepo.save(employee);
				
				return employee;
			} 

		} catch (Exception e) {
			
			
			EmployeeAdress ed = new EmployeeAdress();
			
			return employee;
			// TODO: handle exception } return employee;

		}
		//return employee;
		return employee;
		
		
	}
	
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	public List<Employee> getEmployeeDetails() {
	      List<Employee> employeeDetails = new ArrayList<Employee>();
	      
	      employeeDetails  = employeeRepo.findEmployeeDetails();
	      
	      return employeeDetails;
		
	
	}
	
	@RequestMapping(value = "/getUniqueElements", method = RequestMethod.GET)
	public Set<Employee> getUniqueEmployeeDetails(){
		Set<Employee> employeeset = new HashSet<Employee>();
		employeeset =  employeeRepo.findEmployeeDetailsUnique();
				return employeeset;
	}



}