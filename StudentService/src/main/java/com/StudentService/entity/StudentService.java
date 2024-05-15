package com.StudentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentService {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regid;
	private String name;
	private double cgpa;
	private String dept;
	public Integer getRegid() {
		return regid;
	}
	
	
	public StudentService() {
		super();
	}
	
	public StudentService(String name, double cgpa, String dept) {
		super();
		this.name = name;
		this.cgpa = cgpa;
		this.dept = dept;
	}
	
	public void setRegid(Integer regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
