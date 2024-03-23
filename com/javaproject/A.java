package com.javaproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
      

		List<Integer>l= Arrays.asList(51,52,53,54,55,56,57,58,59,60);
		
		 List<Integer>   l1=       l.stream().filter(i -> isprime(i)).collect(Collectors.toList());
		       System.out.println(l1);    
		}
   
	private static boolean isprime(int x)
	{
		int count=0;
		
		for(int i=2;i<=x;i++)
		{
			if(x%i==0)
			{
				count ++;
			}
		}
		return count==1;
	}
		
	
}