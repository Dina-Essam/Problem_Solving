import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testStringUpperCase {

	@Test
	void testpalindromUpperCaseTrue() {
		assertEquals(ProblemOne.palindrome("ANNA"), true);
	}
	
	@Test
	void testpalindromUpperCaseFalse() {
		assertEquals(ProblemOne.palindrome("Apple"), false);
	}

}
