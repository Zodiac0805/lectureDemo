package com.simple;
class FirstThread extends Thread
{
	public void run()
	{
		try {
		for(int i =1;i<=5;i++)
		{
			System.out.println("MY FIRST THREAD \t"+i);
			
				Thread.sleep(1000);
		}
			} 
		catch (InterruptedException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		System.out.println("Complete");
	}
}
public class threadLifeCycle 
{
	public static void main(String[] args) 
	{
		FirstThread ft = new FirstThread();
		ft.setName("First");
		ft.setPriority(Thread.NORM_PRIORITY);
		System.out.println(ft);
		ft.start();
		ft.run();
		
		for(int i=1;i<5;i++)
		{
			System.out.println("MY MAIN THREAD "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}System.out.println("COmPlEtE..");
	}
}
