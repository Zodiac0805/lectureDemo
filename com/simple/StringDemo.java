package com.simple;

public class StringDemo {
public static void main(String[] args) {
	String s1 = new String("This is Tops Technology");
	System.out.println("Original String is :-" + s1);
	System.out.println("String Length is : "+s1.length());
	System.out.println("String in UpperCase: "+s1.toUpperCase());
	System.out.println("String in LowewCase:" +s1.toLowerCase());
	System.out.println("String in SubString : "+s1.substring(3));
	System.out.println("String in SubString : "+s1.substring(5,13));
	if(s1.equalsIgnoreCase("this is Tops Technology"))
	{
		System.out.println("It is Equal");
	}
	else
	{
		System.out.println("It is not Equal");
	}
}
}
