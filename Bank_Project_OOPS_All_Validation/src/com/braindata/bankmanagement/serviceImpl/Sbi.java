package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi
{
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	@Override
	public void createAccount() 
	{
		
		System.out.println("Enter Account No:");
		int accno=sc.nextInt();
		int accno1=accno;
		int count=0;
		while(accno1!=0)
		{
			accno1=accno1/10;
			count++;
		}
		if(count==8)
		{
			a.setAccNo(accno);
		}else
		{
			System.out.println("Enter Valid Account No");
		}
		
		System.out.println("Enter Name:");
		String nm=sc.next()+sc.nextLine();
		for(int i=0;i<nm.length();i++)
		{
			if(nm.charAt(i)>='a'&&nm.charAt(i)<='z'||nm.charAt(i)>='A'&&nm.charAt(i)<='Z'||nm.charAt(i)==' ')
			{
				a.setName(nm);
			}
			else
			{
				System.out.println("Enter Valid Name");
			}
		}
		System.out.println("Enter Mobile No:");
		String mbno=sc.next();
		if(mbno.matches("[0-9]*")&&mbno.length()==10)
		{
			a.setMobNo(mbno);
		}else
		{
			System.out.println("Enter Valid Mobile No");
		}
		System.out.println("Enter Adhar No:");
		String adhar=sc.next();
		if(adhar.matches("[0-9]*")&&adhar.length()==12)
		{
			a.setAdharNo(adhar);
		}else
		{
			System.out.println("Enter Valid Adhar Number");
		}
		System.out.println("Enter Gender:");
		String gn=sc.next();
		if(gn.equalsIgnoreCase("male")||gn.equalsIgnoreCase("female")||gn.equalsIgnoreCase("F")||gn.equalsIgnoreCase("M"))
		{
			a.setGender(gn);
		}
		else
		{
			System.out.println("Enter Valid Gender");
		}
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			a.setAge(age);
		}else
		{
			System.out.println("Enter Valid Age");
		}
		System.out.println("Enter Amount for Account Creation");
		double accNo=sc.nextDouble();
		if(accNo>=500)
		{
			a.setBalance(accNo);
		}else
		{
			System.out.println("Enter Amount must 500rs Requried");
		}
		
	}

	@Override
	public void displayAllDetails() 
	{
		System.out.println(a.getAccNo());
		System.out.println(a.getName());
		System.out.println(a.getAdharNo());
		System.out.println(a.getGender());
		System.out.println(a.getMobNo());
		System.out.println(a.getAge());
		System.out.println(a.getBalance());
	}

	@Override
	public void depositeMoney()
	{
		System.out.println("Enter Account No:");
		int x=sc.nextInt();
		System.out.println("Enter Deposite Amount:");
		double d=sc.nextDouble();
		double d1=a.getBalance()+d;
		a.setBalance(d1);
		
	}

	@Override
	public void withDrawal()
	{
		System.out.println("Enter Account No:");
		int x=sc.nextInt();
		System.out.println("Enter Withdrawal Amount:");
		double wd=sc.nextDouble();
		double wd1=a.getBalance()-wd;
		a.setBalance(wd1);
		System.out.println("Withdrawal Amount SuccesFully...");
		
	}

	@Override
	public void balanceCheck()
	{
		System.out.println("Enter Accoun No:");
		int accno=sc.nextInt();
		System.out.println(a.getBalance());
		
	}

}
