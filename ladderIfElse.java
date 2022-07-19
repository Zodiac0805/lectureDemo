package com.simple;

import java.util.Scanner;

public class ladderIfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		int s1,s2,s3,total;
		double per;
		
		System.out.println("Enter rollno...");
		rollno=sc.nextInt();
		System.out.println("Enter Name...");
		name=sc.next();
		System.out.println("Enter Physics...");
		s1=sc.nextInt();
		System.out.println("Enter Chemistry...");
		s2=sc.nextInt();
		System.out.println("Enter Maths...");
		s3=sc.nextInt();
		
		total = s1+s2+s3;
		per = total/3;
		
		System.out.println("Percentage is ...."+per);
		if(per>90)
		{
			System.out.println("Distinct");
		}
		else if(per>70)
		{
			System.out.println("First class");
		}
		else if(per>45)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Pass class");
		}
		
		
		
	}
}
