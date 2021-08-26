package javaclass;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account1 a=null;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Create account");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4. DETAILS");
		System.out.println("5.exit");
		
		System.out.println("enter a option:");
		int opt=sc.nextInt();
		
		switch(opt) {
		case 1:
			if(a==null) {
				
				System.out.println("enter your account numbber:");
			
				long acno=sc.nextLong();
				sc.nextLine();
				
				System.out.println("enter the name:");
				
				String name=sc.nextLine();
				
				System.out.println("enter the min balance");
				float balance=sc.nextFloat();
		
				a=new Account1(acno,name,balance);
			}	
				
			break;
		case 2:
			if(a!=null) {
				System.out.println("enter a amount to deposit");
				float amount=sc.nextFloat();
				a.deposit(amount);
				
			}
			else {
				System.out.println("Account not found");
			}
			
			break;
		case 3:
			if(a!=null) {
				System.out.println("enter a amount to withdraw");
				float amount=sc.nextFloat();
				a.withdraw(amount);
				
			}
			else {
				System.out.println("Account not found");
			}
			break;
		case 4:
			if(a!=null) {
				System.out.println("enter the details");
				a.getdetails();
				
			}
			else {
				System.out.println("Account not created");
			}
			break;
		case 5:
			System.out.println("BYE BYE");
			System.exit(0);
			default:
				System.out.println("INVALID OPTION TRY AGAIN");
		}
		
		System.out.println("_______________");
	
	}
	}}