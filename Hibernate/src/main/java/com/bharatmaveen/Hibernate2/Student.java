package com.bharatmaveen.Hibernate2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	private String name;
	private String school;
	@Id
	private int rollno;
	
	//@OneToOne
	
	@OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
	private List<Laptop> lapy =new ArrayList <Laptop>() ;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	
	
	
	public List<Laptop> getLapy() {
		return lapy;
	}
	public void setLapy(List<Laptop> lapy) {
		this.lapy = lapy;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + ", rollno=" + rollno + ", lapy=" + lapy + "]";
	}
	
		
	
}
