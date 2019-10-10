package main.testdouble;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//테스트 더블
public class UserTest {
	private ICoupon coupon;
	@Before
	public void setUp() {
		coupon = new ICoupon() {
			
			@Override
			public boolean isValid() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAppliable(Item item) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getDiscountPercent() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void doExpire() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	@Test
	public void testAddCoupon() throws Exception {
		User user = new User("area88");
		assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());
	
		user.addCoupon(coupon); // 다시 테스트 작성.
		assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
	}


	@Test
	public void testGetLastOccupiedCoupon() throws Exception {
		User user = new User("area88");
		ICoupon eventCoupon = new StubCoupon();
		user.addCoupon(eventCoupon);
		ICoupon lastCoupon = user.getLastOccupiedCoupon();

		assertEquals("쿠폰 할인율", 7, lastCoupon.getDiscountPercent());
		assertEquals(" 쿠폰 이름", "VIP 고객 한가위 감사쿠폰", eventCoupon.getName());

	}

	@Test
	public void testGetOrderPrice_discountableItem() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		// new Item(이름, 카테고리, 가격)
		Item item = new Item("R2D2", "알람시계", 20000);
		ICoupon coupon = new StubCoupon();
		assertEquals(" 쿠폰 적용 안 되는 아이템", 20000, calculator.getOrderPrice(item, coupon));
		//페이크 객체
		Item item2 = new Item("LightSavor", "부엌칼", 100000);
		ICoupon coupon2 = new FakeCoupon();
		assertEquals(" 쿠폰으로 인해 할인된 가격", 93000, calculator.getOrderPrice(item2, coupon2));
		//테스트 스파이 
		Item item3 = new Item("LightSavor", "Kitchen knife", 100000);
		ICoupon coupon3 = new SpyCoupon();
		assertEquals(" 쿠폰으로 인해 할인된 가격", 93000, calculator.getOrderPrice(item3, coupon3));
		int methodCallCount = ((SpyCoupon) coupon3).getIsAppliableCallCount();
		assertEquals("coupon.isAppliable 메소드 호출 횟수", 1, methodCallCount);
	}

}
