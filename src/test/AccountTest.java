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
 * -�Ա�/���
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
		//1) 10000������ ���� ���� (����)
		Account account = new Account(10000);
		//if ����
		assertEquals(10000,account.getBalance());
		
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(1000);
		assertEquals("1000������ ���� ������ �ܰ���ȸ ",1000,account.getBalance());
		
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(0);
		assertEquals(0,account.getBalance());
	}
}
