package com.simple;
class final1
{
	final int a=20;
	final void show()
	{
		System.out.println("A = "+a);
	}
} 
class final2 extends final1
{
	int b=30;
	void show1()
	{
		//super.show();
		System.out.println("B = "+b);
	}
} 

public class finalDemo 
{
	public static void main(String[] args) 
	{
		final2 f = new final2();
		f.show();
		f.show1();
	}
}
