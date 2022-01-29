package main

import (
	"fmt"
	"strings"
)

func main() {

	fmt.Print(palindrome("Anna"))

}

func palindrome(str string) bool {
	clean := strings.TrimSpace(strings.ToLower(strings.ReplaceAll(str, " ", "")))
	for i, j := 0, len(clean)-1; i < len(clean); i, j = i+1, j-1 {
		if clean[i] != clean[j] {
			return false
		}
	}
	return true
}
