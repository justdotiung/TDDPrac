package test;

import main.Account;

/*
 * TDD ����
 * 
 * �������
 * ���� ��� �䱸����
 * -���� �ܰ� ��ȸ
 * -�Ա�/���
 * -���� ���� ���� (�߰� �߻�)
 * -�ݾ��� ������ 
 * ���� > ���� > ���� ��  �ݺ�
*/

// AccountŬ���� �� ���� �׽�Ʈ Ŭ����.
public class AccountTest {
	
	
	//�׽�Ʈ �ó������� �ڵ�� ����ϴ� �۾��� ���� ��ġ�� Ŭ���� ���� �ذ� (�׽�Ʈ ���̽� �ۼ� �� �帧�� ���� �ʱ� ����)
	//���� (�����丵) 1.������ 2.�ߺ��ڵ� 3.���ֺ̹��� 4.���������� �ʿ�κ�
	public void testAccount() throws Exception {
		//�Ϸ��� �帧�� ���� �ۼ� (�ó�����)
		Account account = new Account();
		if(account == null) 		
			throw new Exception("���»��� ����");		
	}
	//�׽�Ʈ ���̽� ����
	public static void main(String[] args) {
		//���°� �����Ǵ��� �׽�Ʈ �ڵ� �� ���� (����) ��� ���� > (����) �����ϵ��� ���� Ŭ���� ���� �� ����ó��
		AccountTest test = new AccountTest();
		try {
			test.testAccount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("����");
		} 
		System.out.println("����");
	}
		
}
