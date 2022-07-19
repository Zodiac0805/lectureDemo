package com.simple;

public class staticBlock 
{
	static int a = 10;
	static int b;
	static void meth(int x)
	{
		System.out.println("X = "+x);
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		
	}
	{
		System.out.println("Hi");
	}
	static
	{
		System.out.println("Static block called");
		b = a*4;
		
	}
	public static void main(String[] args) 
	{
		new staticBlock();
		meth(9);
	}
}
