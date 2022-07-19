package com.simple;
abstract class abs1
{
	public void meth1()
	{
		System.out.println("Non Abstract Class..");
	}
	abstract public void meth2();
	
}
class abs2 extends abs1
{

	@Override
	public void meth2() 
	{
		System.out.println("UnImplemented Method 2 Inplemented in Class ");
		
	}
	
}
public class abstractionDemo 
{
	public static void main(String[] args) 
	{
		abs2 a = new abs2();
		a.meth1();
		a.meth2();
	}
}
