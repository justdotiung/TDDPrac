package main;

public class Account {
	private int balance;

	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int i) {
		this.balance += i;
		
	}

	public void withdraw(int i) {
		this.balance -= i;
	}

}
