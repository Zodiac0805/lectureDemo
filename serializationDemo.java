package com.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int eid;
	String ename;
	double esalary;
	
	public Employee(int eid, String ename, double esalary) 
	{
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public String toString()
	{
		return "\nEid : "+eid+"\nEname : "+ename+"\nEsalary :"+esalary;
		
	}
	
	
}
public class serializationDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Employee e = new Employee(101, "Harshad", 300000);
		
		FileOutputStream fos = new FileOutputStream("ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		fos.flush();
		fos.close();
		
		System.out.println("Success");
		
		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1);
	}
}
