package main.register;

//��ü Ŭ���� ����
public class MockCipher implements Cipher{
	//�׽�Ʈ ���̽��� ����⿡ ������ �ڵ�� ����.
	@Override
	public String encrypt(String source) {
		// TODO Auto-generated method stub
		return "8ee2027983915ec78acc45027d874316";
	}

	@Override
	public String decrypt(String source) {
		// TODO Auto-generated method stub
		return "potato";
	}

}
