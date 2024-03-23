package com.javaproject;

public class Employee {
	
	private int eid;
	private String name;
	private String city;
	
	
	public Employee(int eid,String name,String city)
	{
		this.eid=eid;
		this.name=name;
		this.city=city;
	}

//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + "]";
//	}

	public int getEid()
	{
		return eid;
	}
	

	public String getName()
	{
		return name;
		
	}
	public String getCity()
	{
		return city;
	}
}
