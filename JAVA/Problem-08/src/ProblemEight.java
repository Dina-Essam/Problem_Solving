import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(17);
		numbers.add(3);
		numbers.add(17);
		numbers.add(4);
		numbers.add(-1);
		
		System.out.println(index_of_first_duplicate(numbers));

	}

	
	static public int index_of_first_duplicate(final List<Integer> arr) {
		int index = -1;
		 
        HashSet<Integer> visited = new HashSet<>();
        for (int i=0; i<arr.size(); i++)
        {
            if (visited.contains(arr.get(i)))
            	index = i;
            else   
            	visited.add(arr.get(i));
        }
           return  index;
      
	}
	
	
}
