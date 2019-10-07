package test;

import org.junit.Test;

import main.Account;

/*
 * TDD 공부
 * 
 * 은행계좌
 * 예상 기능 요구사항
 * -계좌 잔고 조회
 * -입금/출금
 * -예상 복리 이자 (추가 발생)
 * -금액은 원단위 
 * 질문 > 응답 > 정제 의  반복
*/
//JUnit 사용
// Account클래스 에 대한 테스트 클래스.
public class AccountTest {
	// JUnit의 사용 으로인한 main()삭제 
	@Test
	public void testAccount() throws Exception {
		//일련의 흐름을 먼저 작성 (시나리오)
		Account account = new Account();
		//if문의 내용은 사실상 시나리오의 '검증'의 부분을 표현하기 위해 필요했기에 실상 필요하지않음 (제거).	
	}
}
