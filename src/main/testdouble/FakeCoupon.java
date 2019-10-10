package main.testdouble;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements ICoupon {
	List<String> categoryList = new ArrayList<>(); // ���ο����� ����� ���
	private int isAppliableCallCount;

	public FakeCoupon() {
		categoryList.add("�ξ�Į");
		categoryList.add("�Ƶ� �峭��");
		categoryList.add("�����ⱸ");
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
		isAppliableCallCount++; // ȣ��Ǹ� ����
		if (this.categoryList.contains(item.getCategory())) {
			return true;
		}
		return false;
	}

	public int getIsAppliableCallCount() { // �� �� ȣ��Ƴ�?
		return this.isAppliableCallCount;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub

	}

}
