package main.testdouble;

public class PriceCalculator {

	public int getOrderPrice(Item item, ICoupon coupon) {
		// 쿠폰이 유효하고 적용 가능하면
		if (coupon.isValid() && coupon.isAppliable(item)) {
			return (int) (item.getPrice() * getDiscountRate(coupon.getDiscountPercent())); // 쿠폰의 할인율을 적용한다
		}
		return (int) item.getPrice();
	}

	private double getDiscountRate(int percent) {
		return (100 - percent) / 100d; // int 연산이 안 되도록 d를 붙임
	}
}
