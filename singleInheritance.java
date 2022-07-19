package com.simple;

import java.util.Scanner;

class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void getA()
	{
		System.out.println("Enter A..");
		a=sc.nextInt();
		
	}
	void showA()
	{
		System.out.println("A is..."+a);
	}
}
class B extends A
{
	int b;
	Scanner sc=new Scanner(System.in);
	void getB()
	{
		System.out.println("Enter B..");
		b=sc.nextInt();
		
	}
	void showB()
	{
		System.out.println("B is..."+b);
	}
}
class C extends B
{
	int c;
	Scanner sc=new Scanner(System.in);
	void getC()
	{
		System.out.println("Enter C..");
		c=sc.nextInt();
		
	}
	
	void showC()
	{
		System.out.println("C is..."+c);
	}
}
public class singleInheritance 
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.getA();
		c.getB();
		c.getC();
		c.showA();
		c.showB();
		c.showC();
	}
}
