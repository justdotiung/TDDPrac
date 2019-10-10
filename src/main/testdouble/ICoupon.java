package main.testdouble;

public interface ICoupon {
	public String getName();               // ���� �̸�
	public boolean isValid();              // ���� ��ȿ ���� Ȯ�� 
	public int getDiscountPercent();       // ������ 
	public boolean isAppliable(Item item); // �ش� �����ۿ� ���� ���� ���� 
	public void doExpire();                // ����� �� ���� �������� ���� 
}
