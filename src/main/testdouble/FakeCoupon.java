package main.testdouble;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements ICoupon {
	List<String> categoryList = new ArrayList<>(); // 내부용으로 사용할 목록
	private int isAppliableCallCount;

	public FakeCoupon() {
		categoryList.add("부엌칼");
		categoryList.add("아동 장난감");
		categoryList.add("조리기구");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAppliable(Item item) {
		isAppliableCallCount++; // 호출되면 증가
		if (this.categoryList.contains(item.getCategory())) {
			return true;
		}
		return false;
	}

	public int getIsAppliableCallCount() { // 몇 번 호출됐나?
		return this.isAppliableCallCount;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub

	}

}
