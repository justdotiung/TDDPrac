package test;

import static org.junit.Assert.*;

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

	@Test
	//Account ���� ���� Ŭ����
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	@Test
	//�ܰ� ��ȸ ���� 
	public void testGetBalance() throws Exception {
		
		Account account = new Account(10000);
		assertEquals(10000,account.getBalance());
		
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(1000);
		assertEquals("1000������ ���� ������ �ܰ���ȸ ",1000,account.getBalance());
		
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(0);
		assertEquals(0,account.getBalance());
	}
	
	@Test
	//�Ա� ���� (�޼����� ������ ���ؼ� �׽�Ʈ���̽� ����)
	public void testDeposit() throws Exception {
		Account account = new Account(10000);
		account.deposit(1000);
		//����(����� Ȯ���� �������� ��������)
		assertEquals(11000,account.getBalance());
		
	}
	@Test
	//��� ����
	public void testWithdraw() throws Exception {
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals(9000,account.getBalance());
	}
}
