package main.mockito;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MokitoTest {
	
	@Test
	public void testName() throws Exception {
		List mockedList = mock(List.class); 
		System.out.println(mockedList.size());
		mockedList.add("item");
		mockedList.clear();
		
		verify(mockedList).add("item");
		verify(mockedList).clear();
		
		when(mockedList.get(0)).thenReturn("item");
		when(mockedList.size()).thenReturn(1);
		when(mockedList.get(1)).thenThrow(new RuntimeException());

		System.out.println(mockedList.get(0));
		System.out.println(mockedList.size());
		System.out.println(mockedList.get(2));
		System.out.println(mockedList.get(1));

	}

}
