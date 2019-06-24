package com.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Entity.EmployeeAdress;
import com.sample.Repositary.EmployeeAddressRepositary;

@RestController
public class EmployeeAdressController {

	
	@Autowired
	private EmployeeAddressRepositary employeeAddressRepo;
	
	@RequestMapping(value = "/saveEmployeeAddres", method = RequestMethod.POST)
	public EmployeeAdress getEmployeeAdress(@RequestBody EmployeeAdress employeeAdd) {
		
		try {
			employeeAdd = employeeAddressRepo.save(employeeAdd);
			return employeeAdd;
		}
		catch (Exception e) {
			
			System.out.println("Exception occured while saving the EmployeeAddress" + e);
			return null;
		}
		
	}
}
