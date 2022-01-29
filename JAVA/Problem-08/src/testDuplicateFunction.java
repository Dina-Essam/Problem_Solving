import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class testDuplicateFunction {

	@Test
	void testDuplicate() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(17);
		numbers.add(3);
		numbers.add(17);
		numbers.add(4);
		numbers.add(-1);
		assertEquals(ProblemEight.index_of_first_duplicate(numbers),3);
	}
	
	@Test
	void testNoDuplicate() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(17);
		numbers.add(3);
		numbers.add(4);
		numbers.add(-1);
		assertEquals(ProblemEight.index_of_first_duplicate(numbers),-1);
	}

}
