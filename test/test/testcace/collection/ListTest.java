package test.testcace.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.testcace.collection.Employee;

public class ListTest {
	@Test
	public void testListEquals_Primitive() throws Exception {
		//기본형 or String List
		List<String> listA = new ArrayList<String>();
		listA.add("e");
		listA.add("c");
		
		List<String> listB = new ArrayList<String>();
		listB.add("e");
		listB.add("c");
		
		assertEquals(listA, listB);
	}
	@Test
	public void testListEqual_NotPrimitiveType() throws Exception {
		List<Employee> listA = new ArrayList<Employee>();
		listA.add( new Employee("aa"));
		listA.add( new Employee("vv"));
	
		List<Employee> listB = new ArrayList<Employee>();
		listB.add( new Employee("aa"));
		listB.add( new Employee("vv"));
		//equals() 와 hashcode()를 오버라이딩 하면 객체 비교 가 가능
//		assertEquals("리스트 비교", listA,listB);
		//toString 으로 비교시 listA와 B는 객체 ID값이 다르기때문에 문자열 비교로 바꿔야 한다.
		assertEquals("리스트 비교", listA.toString(),listB.toString());
	}
}
