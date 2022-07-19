package com.simple;
interface intf1
{
	static void method1()
	{
		System.out.println("Hello...");
	}
}
//class PQR implements intf1
//{
//	
//}
public class interfaceForceObject 
{
	public static void main(String[] args) 
	{
		intf1.method1();
	}
}
