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
		//�׽�Ʈ�� ���� ������ ���� �⺻�����ڸ� �߰��ϴ°��� �ƴ� ���������� �����ϰԲ� ������� �� �� �ִ� 
		//ex) ��ġ���� ���� ���»��� or ��� ���»��� ���� 
		Account account = new Account(10000); //�����߻� �ذ�.
	}
	@Test
	//�ܰ� ��ȸ ���� 
	// getBalacne() �ܰ���ȸ �޼��� 
	public void testGetBalance() throws Exception {
		//1) 10000������ ���� ���� (����)
		Account account = new Account(10000);
		//2) �ܰ� ��ȸ ��� ��ġ (����)
		if(account.getBalance() != 10000) {
			//throw new Exception(); ����
			fail("getBalance() > "+account.getBalance()); //����
		}
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(1000);
		if(account.getBalance() != 1000)
			fail();
		
		//��ӵǴ� �׽�Ʈ ���̽�
		account = new Account(0);
		if(account.getBalance() != 0)
			fail();
	}
}
