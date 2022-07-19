/* What is Exception?
 * an exception is an abnormal situation that arises 
 * during the run time of your program. 
 * 
 * it will terminate the program there itself where the 
 * exception is generated.
 * 
 * e.g If there are 100 lines of code and exception is 
 * raised at line 7, it will not execute the next line i.e. line
 * 8.
 * 
 * in java there are two types of exception
 * 
 * 1)checked exception : This exception is handled at compile time
 * 
 * 2)unchecked exception : This exception is handled at run 
 * time
 * 
 * in java to handle exception there are 5 keywords used.
 * 
 * 1) try
 * 2) catch
 * 3) finally
 * 4) throw 
 * 5) throws
 * 
*/



package com.simple;

import java.util.Scanner;

public class exceptionDemo 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Start code");
		try {
			System.out.println("Enter A..");
			a=sc.nextInt();
			System.out.println("Enter B..");
			b=sc.nextInt();
			System.out.println("A = "+a+"\tB = "+b);
			c = a/b;
			System.out.println("Division is.."+c);
			
			int a1[] = {10,20,30};
			System.out.println(a1[1]);
			System.out.println("End code");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
		
	}
}







