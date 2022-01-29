package main

import "fmt"

func index_of_first_duplicate(arr []int) int {
	visited := make(map[int]bool, 0)
	for i := 0; i < len(arr); i++ {
		if visited[arr[i]] {
			return i
		} else {
			visited[arr[i]] = true
		}
	}
	return -1
}

func main() {
	fmt.Println(index_of_first_duplicate([]int{5, 17, 3, 17, 4, -1}))
}
