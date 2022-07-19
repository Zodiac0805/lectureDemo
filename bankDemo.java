package com.simple;

import java.util.Scanner;

class InsufficientFunds extends Exception
{
	double amount;

	public InsufficientFunds(double amount) {
		this.amount = amount;
	}
	
	public double getAmt()
	{
		return this.amount;
	}
	
	
}

class CheckingAccount{
	
	String accno;
	double balance = 0;
	
	public CheckingAccount(String accno) {		
		this.accno = accno;
		System.out.println("Account No. "+ this.accno);
	}
	
	public void deposit(double amt)
	{
		this.balance = this.balance + amt;
	}
	
	public void withdraw(double amt) throws InsufficientFunds
	{
		if(amt<=this.balance)
		{
			this.balance = this.balance - amt;
		}
		else
		{
			double needs = amt - this.balance;
			throw new InsufficientFunds(needs);
		}
		
	}
	
	public void checkBalance()
	{
		System.out.println("Current Balance : "+ this.balance);
	}
	
	
	
}



public class bankDemo {
 
	public static void main(String[] args) {
	CheckingAccount ca = new CheckingAccount("132323232");
	ca.checkBalance();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amt to Deposit : ");
	double amt = sc.nextDouble();
	ca.deposit(amt);
	ca.checkBalance();
	
	try {
		System.out.println("Enter Amount to Withdraw");
		amt = sc.nextDouble();
		ca.withdraw(amt);
		System.out.println("Withdrawl Successful.");
		ca.checkBalance();
	} catch (InsufficientFunds e) {
		// TODO Auto-generated catch block
		System.out.println("Sorry you Need Rs."+e.getAmt()+" more to Withdraw.");
	}
	
	}
}

