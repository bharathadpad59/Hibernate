package com.bharat.hibernate3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop 
{
	
	@Id
	private int lid;
	private String lname;
	private String lcolor;
	
	@ManyToMany
	private List<Student> studd=new ArrayList<Student>();
	
	
	
	public List<Student> getStudd() {
		return studd;
	}
	public void setStudd(List<Student> studd) {
		this.studd = studd;
	}
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcolor() {
		return lcolor;
	}
	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lcolor=" + lcolor + ", studd=" + studd + "]";
	}
	
	
	
	
	
	
	
}
