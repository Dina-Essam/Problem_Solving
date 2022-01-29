import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class testComposeFunction {

	@Test
	void test() {
		
		Function<Integer,Integer> inc = (i)-> ++i;
	    
	    Function<Integer, Integer> square = (s)-> s*s;
		
		Function<Integer, Integer> h = square.compose(inc);
		assertEquals(h.apply(6), 49);
	}

}
