package main;

import junit.framework.TestCase;

public class AccountJUnit3Test extends TestCase {
	
	private AccountJUnit3 account;
	
	protected void setUp() throws Exception{
		 account = new AccountJUnit3(10000);
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAccountJUnit3() {
		 // TODO 생성자 테스트 작성
	}


	public void testGetBalance() {
		assertEquals(10000, account.getBalance()); // TODO 잔고 조회
	}


	public void testWithdraw() {
		account.withdraw(1000);
		assertEquals(9000, account.getBalance()); // TODO 인출 테스트
	}


	public void testDeposit() {
		account.deposit(1000); 
		assertEquals(11000, account.getBalance());// TODO 예금 테스트
	}

}
