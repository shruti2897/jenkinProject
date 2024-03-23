package com.javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		Employee e1= new Employee(101,"shruti","pune");
		Employee e2= new Employee(102,"AA","latur");
		Employee e3= new Employee(103,"BB","pune");
		Employee e4= new Employee(104,"NN","mumbai");
		
		
		List<Employee>l= Arrays.asList(e1,e2,e3,e4);
		   
		   
		
	List<Employee> l1= l.stream().filter(a->a.getCity().equals("pune")).collect(Collectors.toList());
	  
	   for(Employee e: l1)
	   {
		   System.out.println(e.getEid());
		   System.out.println(e.getName());
		   System.out.println(e.getCity());
	   }
		        		
		        		
		        		
		        		
		        		
		        		
		
		
	}

}
