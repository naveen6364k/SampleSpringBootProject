package com.sample.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Reference;

@Entity
@Table(name="employee_adress")
public class EmployeeAdress implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn
	private Employee employee;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	public int addressId;
	
	@Column(name = "door_no" , nullable = false)
	public String doorNo;
	
	@Column(name="street_name")
	public String streetName;
	
	@Column(name="area")
	public String area;
	
	@Column(name="city")
	public String city;
	

}
