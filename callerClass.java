package com.simple;
class caller
{
	public void call(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class callback implements Runnable
{
	Thread t;
	String tname;
	caller c;
	
	public callback(String tname, caller c) 
	{
		
		this.tname = tname;
		this.c = c;
		t = new Thread(this);
		t.start();
	}

	public void run() 
	{
		synchronized(c)
		{
			c.call(tname);
		}
	}
	
}
public class callerClass 
{
	public static void main(String[] args) 
	{
		caller c = new caller();
		callback c1 = new callback("Hello.",c);
		callback c2 = new callback("World..",c);
		callback c3 = new callback("Synchronized..",c);
	}
}
