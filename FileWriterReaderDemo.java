package com.simple;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("tops1.txt");
		String s = "This is FileWriterReader Demo.";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("Success");
		
		FileReader fr = new FileReader("tops1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
