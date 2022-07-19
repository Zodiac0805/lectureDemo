package com.simple;

import java.util.Scanner;

class insufficentFunds extends Exception
{
	double amount;

	public insufficentFunds(double amount) 
	{
		this.amount = amount;
	}
	public double getAmt()
	{
		return this.amount;
	}
}

class checkingAmount
{
	long accno;
	double bal = 0;
	public checkingAmount(long accno) 
	{
		this.accno = accno;
		System.out.println("Account no. is : "+accno);
	}
	public void deposit(double amt)
	{
		this.bal = this.bal + amt;
	}
	public void withdraw(double amt) throws insufficentFunds
	{
		if(amt<=this.bal)
		{
			this.bal = this.bal - amt;
		}
		else
		{
			double need = amt - this.bal;
			throw new insufficentFunds(need);
			
		}
	}
	public void checkBal()
	{
		System.out.println("Your current balance is : "+ this.bal);
	}
	
	
}
public class bankPracticeDemo 
{
	public static void main(String[] args) 
	{
		checkingAmount ca = new checkingAmount(1234321);
		ca.checkBal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Deposit : ");
		double amt = sc.nextDouble();
		ca.deposit(amt);
		ca.checkBal();
		
		try 
		{
			System.out.println("Enter Amount to Withdraw : ");
			amt = sc.nextDouble();
			ca.withdraw(amt);
			System.out.println("Withdrawl Successful..");
			ca.checkBal();
		} 
		catch (insufficentFunds e) 
		{
			// TODO Auto-generated catch block
			System.out.println("You have insufficient funds :"+e.getAmt());
			ca.checkBal();
		}
	}
}
