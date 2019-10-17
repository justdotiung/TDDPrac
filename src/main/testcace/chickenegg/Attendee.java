package main.testcace.chickenegg;

import java.util.ArrayList;
import java.util.List;

public class Attendee {
	private List<String> addAttendeeList;

	public Attendee() {
		this.addAttendeeList = new ArrayList<String>();
	}

	public void add(String name) {
		addAttendeeList.add(name);
	}

	public String get(int order) {
		String name = addAttendeeList.get(order);
		return name;
	}

}
