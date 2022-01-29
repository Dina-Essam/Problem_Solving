
public class ProblemSix {
	
	static public int[][] transpose(int A[][])
    {
		int rows = A.length;
		int columns = A[0].length;
		int[][]B=new int[columns][rows];
        int i, j;
        for (i = 0; i < columns; i++)
    		for (j = 0; j < rows; j++)
        		B[i][j] = A[j][i];

        return B;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[][]={{1,2,3,4},{5,6,7,8}};    
		int i, j;
	    for(i = 0; i < original.length; i++)  
        {  
            for(j = 0; j < original[0].length; j++)  
            {  
            	System.out.print(original[i][j]+" ");  
            }  
            System.out.println(" ");  
        }
	    int transposed[][] = transpose(original);
	    for(i = 0; i < transposed.length; i++)  
        {  
            for(j = 0; j < transposed[0].length; j++)  
            {  
                System.out.print(transposed[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  

	}

}
