package com.simple;
class Student
{
	int rollno;
	String name;
	
	Student()
	{
		System.out.println("Default Constructor Called");
	}
	Student(int rollno)
	{
		this.rollno=rollno;
		System.out.println(this.rollno);
	}
	Student(int rollno, String name)
	{
		this();
		this.rollno = rollno;
		this.name = name;
		System.out.println("Roll no. : "+rollno);
		System.out.println("Name : "+name);
	}
}
public class thisDemo 
{
	public static void main(String[] args) 
	{
		new Student(12);
		new Student(1,"Hero");
		
	}
}
