package test.testcace.chickenegg;

import static org.junit.Assert.*;

import org.junit.Test;

import main.testcace.chickenegg.Attendee;


public class AttndeeTest {
	@Test
	public void testAdd() throws Exception {
		Attendee attendee = new Attendee();
		attendee.add("ȫ�浿");
		assertEquals("ȫ�浿",attendee.get(0));
	}
	@Test
	public void testGet() throws Exception {
		Attendee attendee = new Attendee();
		attendee.add("ȫ�浿");
		assertEquals("ȫ�浿", attendee.get(0));
	}
}
