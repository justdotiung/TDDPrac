package test;

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

// Account클래스 에 대한 테스트 클래스.
public class AccountTest {
	
	
	//테스트 시나리오를 코드로 기술하는 작업을 먼저 마치고 클래스 에러 해결 (테스트 케이스 작성 시 흐름을 잃지 않기 위함)
	//정제 (리팩토링) 1.가독성 2.중복코드 3.네이밍변경 4.구조개선의 필요부분
	public void testAccount() throws Exception {
		//일련의 흐름을 먼저 작성 (시나리오)
		Account account = new Account();
		if(account == null) 		
			throw new Exception("계좌생성 실패");		
	}
	//테스트 케이스 실행
	public static void main(String[] args) {
		//계좌가 생성되는지 테스트 코드 선 실행 (질문) 결과 실패 > (응답) 성공하도록 만듬 클래스 생성 및 예외처리
		AccountTest test = new AccountTest();
		try {
			test.testAccount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("실패");
		} 
		System.out.println("성공");
	}
		
}
