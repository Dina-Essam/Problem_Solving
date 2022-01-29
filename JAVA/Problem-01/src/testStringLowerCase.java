import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStringLowerCase {

	@Test
	void testpalindromLowerCaseTrue() {
		assertEquals(ProblemOne.palindrome("anna"), true);
	}
	
	@Test
	void testpalindromLowerCaseFalse() {
		assertEquals(ProblemOne.palindrome("apple"), false);
	}

}
