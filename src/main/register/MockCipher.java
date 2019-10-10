package main.register;

//목객체 클래스 구현
public class MockCipher implements Cipher{
	//테스트 케이스로 만들기에 적합한 코드로 구현.
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
