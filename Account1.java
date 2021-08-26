package javaclass;

public class Account1 {
	long acno;
	String name;//instance variable
	float balance;
	
	
public Account1() {
	
}
public Account1(long acno,String name,float balance) {
	this.acno=acno;
	this.name=name;
	this.balance=balance;
}
void deposit(float amount) {
	this.balance=this.balance+amount;
	System.out.println(balance+"+"+amount+"="+balance);
}

void withdraw(float amount) {
	if(balance>=amount) { 
		this.balance=this.balance-amount;
		System.out.println(balance+"-"+amount+"="+balance);}
		else {
			System.out.println("INSUFFICIENT BALANCE IDIOT");}
	}

void getdetails() {
	System.out.println(acno+"|"+name+"|"+balance);
}

}
