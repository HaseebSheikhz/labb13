package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class isevenTest {

	@Test
	void test() {
		
		assertEquals(false, JUnitTesting.isEven(5));
	}

}
