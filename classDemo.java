package com.simple;

import java.util.Scanner;

public class classDemo 
{	
	void getVal()
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter A=  ");
		a=sc.nextInt();
		System.out.println("A is...."+a);
	}
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		int a;
//		System.out.println("Enter A=  ");
//		a=sc.nextInt();
//		System.out.println("A is...."+a);
		classDemo c1=new classDemo();
		c1.getVal();
	}
}
