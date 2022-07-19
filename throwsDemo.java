package com.simple;

import java.util.Scanner;

public class throwsDemo 
{
	public static void demo()throws Exception
	{
		int x;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter X..");
			x=sc.nextInt();
			
			if(x > 0)
			{
				System.out.println("Square of X : "+ (x*x));
				
			}
			else
			{
				throw new Exception("\nPlease enter +ve value");
			}
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		demo();
	}
}
