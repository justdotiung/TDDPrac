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
	
	//Mock�� �̿��� TDD
	@Test
	public void testSavePassword() throws Exception {
		
		//�ٸ������� �����޴� ������ ��ü�� �����Ͽ� �׽�Ʈ���̽� ����.
		Cipher cipher = new MockCipher(); 

		String userId = "sweet88";
		String password = "potato";
		
		register.savePassword(userId , cipher.encrypt(password));
		String decrypedPassword = cipher.decrypt(register.getPassword(userId));
		assertEquals(password,decrypedPassword);
	}
}
