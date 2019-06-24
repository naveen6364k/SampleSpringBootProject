package com.sample.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.Entity.EmployeeAdress;

@Repository
public interface EmployeeAddressRepositary extends JpaRepository<EmployeeAdress, Long> {

}
