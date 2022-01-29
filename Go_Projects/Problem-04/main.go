package main

import "fmt"

func main() {

	square := func(x int) int { return x * x }
	inc := func(x int) int { return x + 1 }
	h := func(x int) int { return square(inc(x)) }

	fmt.Print(h(6))

}
