package com.simple;

import java.util.Scanner;

public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int choice;
		float a=9,b=81;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
		System.out.println("Enter ur choice...");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Add is "+(a+b));
		break;
		case 2 : System.out.println("Sub is "+(a-b));
		break;
		case 3 : System.out.println("Mul is "+(a*b));
		break;
		case 4 : System.out.println("Div is "+String.format("%.2f",(a/b)));
		break;
		}
	}
}
