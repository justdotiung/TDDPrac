package main.testdouble;

public class PriceCalculator {

	public int getOrderPrice(Item item, ICoupon coupon) {
		// ������ ��ȿ�ϰ� ���� �����ϸ�
		if (coupon.isValid() && coupon.isAppliable(item)) {
			return (int) (item.getPrice() * getDiscountRate(coupon.getDiscountPercent())); // ������ �������� �����Ѵ�
		}
		return (int) item.getPrice();
	}

	private double getDiscountRate(int percent) {
		return (100 - percent) / 100d; // int ������ �� �ǵ��� d�� ����
	}
}
