package com.simple;
class MyThread extends Thread
{
	public MyThread()
	{
		super("Child Thread");
		start();
		
	}
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(this +""+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Exit");
	}
}
public class threadNew 
{
	public static void main(String[] args) 
	{
		new MyThread();
	}
}
	