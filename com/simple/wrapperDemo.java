package com.simple;

public class wrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(10);
		System.out.println("autoBoxing : "+i1);
		
		int a = 100;
		Integer i2 = new Integer(a);
		System.out.println("unBoxing : "+i2);
		
		int z = i1.intValue();
		System.out.println("unBoxing : "+ z);
		
		String s = "786";
		int add = Integer.parseInt(s);
		System.out.println("unBoxing : "+(add+i1));
		
		String s1 = i2.toString();
		s1 = "tops";
		System.out.println("String : "+s1);
	}
}
