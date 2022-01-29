
public class ProblemNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(10);
		Node node12 = new Node(10);
		Node node13 = new Node(10);
		Node node14 = new Node(10);
		Node node15 = new Node(10);
		node1.children.add(node12);
		node1.children.add(node14);
		node1.children.add(node13);
		node1.children.add(node15);
		Node node2 = new Node(20);
		Node node3 = new Node(60);
		Node root = new Node(100);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		System.out.println(root.sum_nodes());
	}

}
