import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEncoderDecoder {

	@Test
	void test() {
		String Encoder = ProblemThree.runLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx");
		assertEquals(ProblemThree.runLengthDecode(Encoder), "aaaaaaaaaabbbaxxxxyyyzyx");
	}
	
	@Test
	void test2() {
		String Encoder = ProblemThree.runLengthEncode2("aaaaaaaaaabbbaxxxxyyyzyx");
		assertEquals(ProblemThree.runLengthDecode2(Encoder), "aaaaaaaaaabbbaxxxxyyyzyx");
	}
	
	@Test
	void testContainNumbers() {
		String Encoder = ProblemThree.runLengthEncode("33333aaaaaaaaaa111111bbbaxxxxyyyzyx22222");
		assertEquals(ProblemThree.runLengthDecode(Encoder), "33333aaaaaaaaaa111111bbbaxxxxyyyzyx22222");
	}
	
	@Test
	void test2ContainNumbers() {
		String Encoder = ProblemThree.runLengthEncode2("33333aaaaaaaaaa111111bbbaxxxxyyyzyx22222");
		assertEquals(ProblemThree.runLengthDecode2(Encoder), "33333aaaaaaaaaa111111bbbaxxxxyyyzyx22222");
	}

}
