package main

import "fmt"

func unique(arr []string) []string {
	var result []string
	frequency := make(map[string]int)
	for _, item := range arr {
		frequency[item]++
	}
	for key, element := range frequency {
		if element == 1 {
			result = append(result, key)
		}
	}
	return result
}

func main() {
	a := []string{"apples", "oranges", "flowers", "apples"}
	t := unique(a)
	fmt.Println(a)
	fmt.Println(t)
}
