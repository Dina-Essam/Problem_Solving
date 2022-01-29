import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNode {

	@Test
	void testNodeWithChildern() {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(60);
		Node root = new Node(100);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		assertEquals(root.sum_nodes(), 190);
	}
	
	@Test
	void testNodeWithOutChildern() {
		Node root = new Node(100);
		assertEquals(root.sum_nodes(), 100);
	}
	
	@Test
	void testNodeWithNestedChildern() {
		Node node1 = new Node(10);
		Node node1_2 = new Node(10);
		Node node1_3 = new Node(10);
		Node node1_4 = new Node(10);
		Node node1_5 = new Node(10);
		node1.children.add(node1_2);
		node1.children.add(node1_4);
		node1.children.add(node1_3);
		node1.children.add(node1_5);
		Node node2 = new Node(20);
		Node node3 = new Node(60);
		Node root = new Node(100);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		assertEquals(root.sum_nodes(), 230);
	}

}
