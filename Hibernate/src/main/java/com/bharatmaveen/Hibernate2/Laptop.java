package com.bharatmaveen.Hibernate2;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	private String laptopname;
	@Id
	private int laptopid;
	
	@ManyToOne
	private Student student;
	
	public String getLaptopname() {
		return laptopname;
	}
	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}
	public int getLaptopid() {
		return laptopid;
	}
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [laptopname=" + laptopname + ", laptopid=" + laptopid + ", student=" + student + "]";
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
