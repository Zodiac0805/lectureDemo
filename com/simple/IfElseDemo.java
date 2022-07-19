package com.simple;

import java.util.Scanner;

public class IfElseDemo 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A ....");
		a=sc.nextInt();
		System.out.println("Enter B ....");
		b=sc.nextInt();
		System.out.println("Enter C ....");
		c=sc.nextInt();
		System.out.println("A= "+a+"\nB= "+b+"\nC= "+c);
		
		if(a>b && a>c)
		{
			System.out.println("A is max..");
		}
		else if(b>c)
		{
			System.out.println("B is max..");
		}
		else
		{
			System.out.println("C is max..");
		}
	}
}
