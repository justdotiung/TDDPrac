package test;

import static org.junit.Assert.*;

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
 * -입금/출금
 * -예상 복리 이자 (추가 발생)
 * -금액은 원단위 
 * 질문 > 응답 > 정제 의  반복
*/

// Account클래스 에 대한 테스트 클래스.
public class AccountTest {

	@Test
	//Account 계좌 생성 클래스
	public void testAccount() throws Exception {
		//테스트로 인해 무조건 적인 기본생성자를 추가하는것이 아닌 업무적으로 생각하게끔 만들어줄 수 도 있다 
		//ex) 예치금이 있이 계좌생성 or 없어도 계좌생성 가능 
		Account account = new Account(10000); //오류발생 해결.
	}
	@Test
	//잔고 조회 서비스 
	// getBalacne() 잔고조회 메서드 
	public void testGetBalance() throws Exception {
		//1) 10000원으로 계좌 생성 (실패)
		Account account = new Account(10000);
		//2) 잔고 조회 결과 일치 (실패)
		if(account.getBalance() != 10000) {
			//throw new Exception(); 오류
			fail("getBalance() > "+account.getBalance()); //실패
		}
		//계속되는 테스트 케이스
		account = new Account(1000);
		if(account.getBalance() != 1000)
			fail();
		
		//계속되는 테스트 케이스
		account = new Account(0);
		if(account.getBalance() != 0)
			fail();
	}
}
