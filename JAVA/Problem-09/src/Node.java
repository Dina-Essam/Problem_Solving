import java.util.ArrayList;
import java.util.List;

		public class Node
		{
		    int key;
		    List<Node> children;
		 
		    public Node(int item)
		    {
		        key = item;
		        children = new ArrayList<Node>();
		    }
		    
		    public Integer sum_nodes()
		    {
		    	Integer sum = key;
		    	for(Node child : children)
		    	{
		    		sum = sum + child.sum_nodes();
		    	}
				return sum;
		    }
		}