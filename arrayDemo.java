package com.simple;

import java.util.Scanner;

public class arrayDemo 
{
	public static void main(String[] args) 
	{
		int ardemo[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<ardemo.length; i++)
		{
			System.out.println("Enter elements ["+(i+1)+"]=");
			ardemo[i]=sc.nextInt();
			
		}
		for(int i=0; i<ardemo.length; i++)
		{
			System.out.println("Enter elements ["+(i+1)+"]="+ardemo[i]);
		}
		System.out.println("\nDesending Order ");
		for(int i=0;i<ardemo.length;i++)
		{
			for(int j=i+1; j<ardemo.length;j++)
			{
				if(ardemo[i]< ardemo[j])
				{
					int temp;
					temp = ardemo[i];
					ardemo[i]=ardemo[j];
					ardemo[j]= temp;
					
				}
			}
		}
		for(int i=0; i<ardemo.length; i++)
		{
			System.out.println("Enter elements ["+(i+1)+"]="+ardemo[i]);
		}
		System.out.println("\nAsending Order ");
		for(int i=0;i<ardemo.length;i++)
		{
			for(int j=i+1; j<ardemo.length;j++)
			{
				if(ardemo[i]> ardemo[j])
				{
					int temp;
					temp = ardemo[i];
					ardemo[i]=ardemo[j];
					ardemo[j]= temp;
					
				}
			}
		}
		for(int i=0; i<ardemo.length; i++)
		{
			System.out.println("Enter elements ["+(i+1)+"]="+ardemo[i]);
		}
	}
}
