package main.testdouble;

public class StubCoupon implements ICoupon {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "VIP °í°´ ÇÑ°¡À§ °¨»çÄíÆù";
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public boolean isAppliable(Item item) {
		if (item.getCategory().equals("ºÎ¾ıÄ®")) {
			return true;
		} else if (item.getCategory().equals("¾Ë¶÷½Ã°è")) {
			return false;
		}
		return false;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub

	}

}
