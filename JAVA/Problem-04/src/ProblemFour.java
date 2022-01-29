import java.util.function.Function;

/**
 * 
 */

/**
 * @author Dina Essam
 */
public class ProblemFour {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> inc = (i)-> ++i;
	    
	    Function<Integer, Integer> square = (s)-> s*s;
		
		Function<Integer, Integer> h = square.compose(inc);
		
		Function<Integer, Integer> h2 = inc.andThen(square);
		
		System.out.println(h.apply(0));
		System.out.println(h2.apply(-3));
		
			
	}
	
	
}
