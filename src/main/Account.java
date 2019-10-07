package main;

public class Account {
	private int balance;
	public Account(int i) {
		this.balance = i;
	}

	public int getBalance() {
		//테스트 코드를 성공 시켜줄만큼만의 코드를 고친다.
		//return 10000;
		
		//계속되는 테스트 케이스들에 성공할수있는 로직으로 바꿔준다.
		return this.balance;
	}

}
