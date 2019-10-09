package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HamcrestTest {

	@Test
	public void testArray() throws Exception {
		assertThat("start Date ºñ±³","2010/02/03",is("2010/02/03"));
	}
	
}
