package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestHam {
	@Test
	void testName() throws Exception {
		assertThat("start Date ºñ±³","2010/02/03",is("2010/02/04"));

	}
	@Test
	void testToString() throws Exception {
		String same ="adb";
	}
}
