package main;

public class Account {
	private int balance;
	//파라미터 변경
	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		return this.balance;
	}

}
