package com.simple;

public class threadDemo 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Starting Static Thread\n");
		System.out.println(t);
		t.setName("Jeet");
		//System.out.println("After change in name : "+t);
		t.setPriority(Thread.MIN_PRIORITY);
		//System.out.println("After priority change : "+t);
		
		//System.out.println("IS thread alive or not..: \n"+t.isAlive());
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t + ": " + i);
				Thread.sleep(1000);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Ending Thread");
	}
}
