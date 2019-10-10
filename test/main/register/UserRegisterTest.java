package main.register;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegisterTest {
	private UserRegister register;

	@Before
	public void setUp() {
		register = new UserRegister();
	}
	
	@Test
	public void testUserRegister() throws Exception {}
	
	//Mock을 이용한 TDD
	@Test
	public void testSavePassword() throws Exception {
		
		//다른곳에서 제공받는 사항을 목객체로 구현하여 테스트케이스 구현.
		Cipher cipher = new MockCipher(); 

		String userId = "sweet88";
		String password = "potato";
		
		register.savePassword(userId , cipher.encrypt(password));
		String decrypedPassword = cipher.decrypt(register.getPassword(userId));
		assertEquals(password,decrypedPassword);
	}
}
