/*
 * throw: it is a keyword.
 * 		  It is not a block of code like try/catch
 * 		  It is mainly used to prove explicit exception.
 *        
 * Rules:
 * 1) throw is not a block
 * 2) throw works with object of that class.
 * 3) you cannot write any statement after throw
 * 4) if exception is thrown then it will immediately look for catch block       
 */



package com.simple;

import java.util.Scanner;

public class throwDemo 
{
	public static void demo()
	{
		int x;
		try {
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
		catch(Exception e)
		{
			
			System.out.println("Exception caught"+e);
			demo();
		}
	}
	
	public static void main(String[] args) 
	{
		demo();
	}
}
