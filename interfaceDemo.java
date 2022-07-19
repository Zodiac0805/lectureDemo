package com.simple;
interface ifs1
{
	void meth1();
	
}
interface ifs2 extends ifs1
{
	void meth2();
	
}
class ABC implements ifs1,ifs2
{

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 of Interface is implemented");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 of Interface is implemented");
	}
	
}

class XYZ implements ifs2
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 of Interface is implemented in class XYZ");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 of Interface is implemented in class XYZ");
	}
	
}

public class interfaceDemo 
{
	public static void main(String[] args) 
	{
		ABC a=new ABC();
		a.meth1();
		a.meth2();
		XYZ x=new XYZ();
		x.meth1();
		x.meth2();
		
	}
}

