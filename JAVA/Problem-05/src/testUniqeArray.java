import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class testUniqeArray {

	@Test
	void testContainUniqe() {
		List<String> list = Arrays.asList("apples", "oranges", "flowers", "apples");
		List<String> result = Arrays.asList("oranges", "flowers");
		List<String> stream = ProblemFive.unique(list);
		assertEquals(stream, result);
	}
	
	@Test
	void testDontContainUniqe() {
		List<String> list = Arrays.asList("apples", "apples");
		List<String> result = Arrays.asList();
		List<String> stream = ProblemFive.unique(list);
		assertEquals(stream, result);
	}

}
