package com.sample.Repositary;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.Entity.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Long>{

	@Query("FROM Employee")
	public List<Employee> findEmployeeDetails();

	@Query("FROM Employee")
	public Set<Employee> findEmployeeDetailsUnique();

	

}
