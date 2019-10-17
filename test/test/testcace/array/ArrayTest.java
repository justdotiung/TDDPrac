package test.testcace.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	@Test
	public void testArrayEqual() throws Exception {
		Integer[] arrayA = {1,2,3};
		Integer[] arrayB = {1,2,3};
		assertArrayEquals("�� �迭�� ���� ������ ���ƾ� ��", arrayA,arrayB);
	}
	@Test
	public void testArrayEqual_NotSorted() throws Exception {
		Integer[] arrayA = {1,2,3};
		Integer[] arrayB = {2,1,3};
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		assertArrayEquals("�� �迭�� ������ �޶� ����", arrayA,arrayB);
		
	}
}
