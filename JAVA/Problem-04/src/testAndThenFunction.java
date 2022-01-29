import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class testAndThenFunction {

	@Test
	void test() {
		
		Function<Integer,Integer> inc = (i)-> ++i;
	    
	    Function<Integer, Integer> square = (s)-> s*s;
		
		Function<Integer, Integer> h = inc.andThen(square);
		assertEquals(h.apply(6), 49);
	}

}
