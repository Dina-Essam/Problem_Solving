import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStringMixedCases {

	@Test
	void testpalindromMixedCasesTrue() {
		assertEquals(ProblemOne.palindrome("AnNa"), true);
	}
	
	@Test
	void testpalindromMixedCasesFalse() {
		assertEquals(ProblemOne.palindrome("ApPlE"), false);
	}

}
