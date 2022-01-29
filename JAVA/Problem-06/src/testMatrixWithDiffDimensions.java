import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMatrixWithDiffDimensions {

	@Test
	void test() {
		int original[][]={{1,2,3,4},{5,6,7,8}};
		int transposed[][]={{1,5}, {2,6}, {3,7}, {4,8}};
		int checked[][]=ProblemSix.transpose(original);
		for(int i = 0; i < transposed.length; i++)  
            for(int j = 0; j < transposed[0].length; j++)   
            	assertEquals(checked[i][j], transposed[i][j]);
	}

}
