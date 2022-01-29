import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMatrixWithSameDimensions {

	@Test
	void test() {
		int original[][]={{1,2,3},{4,5,6},{7,8,9}};
		int transposed[][]={{1,4,7}, {2,5,8}, {3,6,9}};
		int checked[][]=ProblemSix.transpose(original);
		for(int i = 0; i < transposed.length; i++)  
            for(int j = 0; j < transposed[0].length; j++)   
            	assertEquals(checked[i][j], transposed[i][j]);
	}

}
