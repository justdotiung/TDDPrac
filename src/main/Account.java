package main;

public class Account {
	private int balance;
	public Account(int i) {
		this.balance = i;
	}

	public int getBalance() {
		//�׽�Ʈ �ڵ带 ���� �����ٸ�ŭ���� �ڵ带 ��ģ��.
		//return 10000;
		
		//��ӵǴ� �׽�Ʈ ���̽��鿡 �����Ҽ��ִ� �������� �ٲ��ش�.
		return this.balance;
	}

}
