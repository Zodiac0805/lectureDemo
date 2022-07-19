package com.simple;

import java.util.Scanner;

public class staticDemo 
{
	static int a;
	
	static void setA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A..");
		a=sc.nextInt();
		
	}
	static void getA()
	{
		System.out.println("A = "+a);
	}

	
	int b;
	
	void setB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter B..");
		b=sc.nextInt();
		
	}
	void getB()
	{
		System.out.println("B = "+b);
	}
	
	
	public static void main(String[] args) 
	{
		setA();
		setA();
		setA();
		
		getA();
		getA();
		getA();
		
		staticDemo s1=new staticDemo();
		staticDemo s2=new staticDemo();
		staticDemo s3=new staticDemo();
		s1.setB();
		s2.setB();
		s3.setB();
		
		s1.getB();
		s2.getB();
		s3.getB();
		
	}
}
