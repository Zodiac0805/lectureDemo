package com.simple;

class A1
{
	A1()
	{
		System.out.println("A1's constructor called");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1's constructor called");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1's constructor called");
	}
	void show()
	{
		
	}
}
public class constructorChaining 
{
	public static void main(String[] args) 
	{
		C1 c= new C1();
		
	}
}
