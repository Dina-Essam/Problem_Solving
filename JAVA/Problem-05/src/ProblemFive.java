import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemFive {
	
	public static List<String> unique(List<String> list) {
		return list.stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("apples", "oranges", "flowers", "apples");
		List<String> stream = unique(list);
		
		System.out.println(stream);

	}

}
