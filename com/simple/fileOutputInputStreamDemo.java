package com.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileOutputInputStreamDemo 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("tops.txt");
		String s = "This is FileOutputInputStream ex.";
		byte[] b = s.getBytes();
		
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Successful");
		
		FileInputStream fis = new FileInputStream("tops.txt");
		
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
//		for(int i; i=(fis.read()!=-1);i++)
//		{
//			System.out.print((char)i);
//		}
		
	}
}
