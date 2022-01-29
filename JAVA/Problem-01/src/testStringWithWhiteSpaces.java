import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStringWithWhiteSpaces {

	@Test
	void testpalindromMixedCasesTrue() {
		assertEquals(ProblemOne.palindrome("A  n   N  a"), true);
	}
	
	@Test
	void testpalindromMixedCasesFalse() {
		assertEquals(ProblemOne.palindrome("A  p  Pl  E"), false);
	}

}
