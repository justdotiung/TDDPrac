package test.testcace.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.testcace.collection.Employee;

public class ListTest {
	@Test
	public void testListEquals_Primitive() throws Exception {
		//�⺻�� or String List
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
		//equals() �� hashcode()�� �������̵� �ϸ� ��ü �� �� ����
//		assertEquals("����Ʈ ��", listA,listB);
		//toString ���� �񱳽� listA�� B�� ��ü ID���� �ٸ��⶧���� ���ڿ� �񱳷� �ٲ�� �Ѵ�.
		assertEquals("����Ʈ ��", listA.toString(),listB.toString());
	}
}
