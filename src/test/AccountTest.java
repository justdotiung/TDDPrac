package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Account;

/*
 * TDD 공부
 * 
 * 은행계좌
 * 예상 기능 요구사항
 * -계좌 잔고 조회
 * 	1) 10000원으로 계좌 생성
 *  2) 잔고 조회 결과 일치
 * -입금
 * 	1) 10000원으로 계좌 생성
 *  2) 1000원 입금
 *  3) 잔고 11000원 확인
 * -출금
 *  1) 10000원으로 계좌생성
 *  2) 1000원 출금
 *  3) 잔고 9000원 확인
 * -예상 복리 이자 (추가 발생)
 * -금액은 원단위 
 * 질문 > 응답 > 정제 의  반복
*/

// Account클래스 에 대한 테스트 클래스.
public class AccountTest {

	private Account account;
	@Before
	public void setUp() {
		account = new Account(10000);
	}
	@Test
	//Account 계좌 생성 클래스
	public void testAccount() throws Exception {
	}
	@Test
	//잔고 조회 서비스 
	public void testGetBalance() throws Exception {

		assertEquals(10000,account.getBalance());
		
		account = new Account(1000);
		assertEquals("1000원으로 계좌 생성후 잔고조회 ",1000,account.getBalance());
		
		account = new Account(0);
		assertEquals(0,account.getBalance());
	}
	
	@Test
	//입금 서비스 
	public void testDeposit() throws Exception {
		account.deposit(1000);
		assertEquals(11000,account.getBalance());
		
	}
	@Test
	//출금 서비스
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals(9000,account.getBalance());
	}
}
