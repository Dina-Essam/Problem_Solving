package main

import "fmt"

func transpose(a [][]int) [][]int {
	b := make([][]int, len(a[0]))
	for i := range b {
		b[i] = make([]int, len(a))
	}
	for i := 0; i < len(b); i++ {
		for j := 0; j < len(b[i]); j++ {
			b[i][j] = a[j][i]
		}
	}
	return b
}

func main() {
	a := [][]int{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}}
	t := transpose(a)
	fmt.Println(a)
	fmt.Println(t)
}
