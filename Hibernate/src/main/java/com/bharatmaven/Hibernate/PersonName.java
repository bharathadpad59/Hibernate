package com.bharatmaven.Hibernate;

import javax.persistence.Embeddable;

@Embeddable                // u can't write @id here because it is the external table but we r adding into first table 
public class PersonName   //so its like foreign key. and child table adding to parent table.
{
	private String firstname;
	private String middlename;
	private String lastname;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "PersonName [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
	}
	
	
}
