package main;

public class AccountJUnit3 {
	private int balance;
	public AccountJUnit3(int money) {
		this.balance = money;
	}
	
	public int getBalance() {return this.balance;}
	
	public void withdraw(int money) {this.balance -= money;}
	
	public void deposit(int money) {this.balance += money;}
	public static void main(String[] args) {
		String value = "a123";
		System.out.println(Integer.parseInt(value));
	}
}
