package junit;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countTest {

	@Test
	static void test() {
		
		assertEquals(6, JUnitTesting.countA("aaaaaaaa"));
		
	}

} 
