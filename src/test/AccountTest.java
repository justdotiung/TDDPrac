package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Account;

/*
 * TDD ����
 * 
 * �������
 * ���� ��� �䱸����
 * -���� �ܰ� ��ȸ
 * 	1) 10000������ ���� ����
 *  2) �ܰ� ��ȸ ��� ��ġ
 * -�Ա�
 * 	1) 10000������ ���� ����
 *  2) 1000�� �Ա�
 *  3) �ܰ� 11000�� Ȯ��
 * -���
 *  1) 10000������ ���»���
 *  2) 1000�� ���
 *  3) �ܰ� 9000�� Ȯ��
 * -���� ���� ���� (�߰� �߻�)
 * -�ݾ��� ������ 
 * ���� > ���� > ���� ��  �ݺ�
*/

// AccountŬ���� �� ���� �׽�Ʈ Ŭ����.
public class AccountTest {

	private Account account;
	@Before
	public void setUp() {
		account = new Account(10000);
	}
	@Test
	//Account ���� ���� Ŭ����
	public void testAccount() throws Exception {
	}
	@Test
	//�ܰ� ��ȸ ���� 
	public void testGetBalance() throws Exception {

		assertEquals(10000,account.getBalance());
		
		account = new Account(1000);
		assertEquals("1000������ ���� ������ �ܰ���ȸ ",1000,account.getBalance());
		
		account = new Account(0);
		assertEquals(0,account.getBalance());
	}
	
	@Test
	//�Ա� ���� 
	public void testDeposit() throws Exception {
		account.deposit(1000);
		assertEquals(11000,account.getBalance());
		
	}
	@Test
	//��� ����
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals(9000,account.getBalance());
	}
}
