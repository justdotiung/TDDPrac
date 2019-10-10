package main.testdouble;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//�׽�Ʈ ����
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
		assertEquals("���� ���� ��", 0, user.getTotalCouponCount());
	
		user.addCoupon(coupon); // �ٽ� �׽�Ʈ �ۼ�.
		assertEquals("���� ���� ��", 1, user.getTotalCouponCount());
	}


	@Test
	public void testGetLastOccupiedCoupon() throws Exception {
		User user = new User("area88");
		ICoupon eventCoupon = new StubCoupon();
		user.addCoupon(eventCoupon);
		ICoupon lastCoupon = user.getLastOccupiedCoupon();

		assertEquals("���� ������", 7, lastCoupon.getDiscountPercent());
		assertEquals(" ���� �̸�", "VIP �� �Ѱ��� ��������", eventCoupon.getName());

	}

	@Test
	public void testGetOrderPrice_discountableItem() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		// new Item(�̸�, ī�װ�, ����)
		Item item = new Item("R2D2", "�˶��ð�", 20000);
		ICoupon coupon = new StubCoupon();
		assertEquals(" ���� ���� �� �Ǵ� ������", 20000, calculator.getOrderPrice(item, coupon));
		//����ũ ��ü
		Item item2 = new Item("LightSavor", "�ξ�Į", 100000);
		ICoupon coupon2 = new FakeCoupon();
		assertEquals(" �������� ���� ���ε� ����", 93000, calculator.getOrderPrice(item2, coupon2));
		//�׽�Ʈ ������ 
		Item item3 = new Item("LightSavor", "Kitchen knife", 100000);
		ICoupon coupon3 = new SpyCoupon();
		assertEquals(" �������� ���� ���ε� ����", 93000, calculator.getOrderPrice(item3, coupon3));
		int methodCallCount = ((SpyCoupon) coupon3).getIsAppliableCallCount();
		assertEquals("coupon.isAppliable �޼ҵ� ȣ�� Ƚ��", 1, methodCallCount);
	}

}
