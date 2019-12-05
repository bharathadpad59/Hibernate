package com.bharatmaven.Hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Table(name="Person_Table2")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Person 
{
	
	private  PersonName personname;
	@Id
	private int rollno;
	//@Transient
	private String school;
	
	
	
	public PersonName getPersonname() {
		return personname;
	}
	public void setPersonname(PersonName personname) {
		this.personname = personname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Person [personname=" + personname + ", rollno=" + rollno + ", school=" + school + "]";
	}

	
	
	
	
}
