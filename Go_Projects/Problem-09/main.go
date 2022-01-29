package main

import "fmt"

type Node struct {
	value    int
	children []*Node
}

func sum_nodes(node *Node) int {
	sum := node.value

	for _, child := range node.children {
		sum = sum + sum_nodes(child)
	}

	return sum
}

func main() {
	p1 := Node{
		value: 6,
	}

	p2 := Node{
		value: 9,
	}

	root := Node{
		value:    15,
		children: []*Node{&p1, &p2},
	}

	fmt.Println(sum_nodes(&root))

}
