package main

import (
	"fmt"
	"strconv"
	"strings"
	"unicode"
)

func main() {
	fmt.Println(runLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx"))
	fmt.Println(runLengthDecode("10a3b1a4x3y1z1y1x"))
	fmt.Println(runLengthEncode2("aaaaaaaaaabbbaxxxxyyyzyx"))
	fmt.Println(runLengthDecode2("a10b3a1x4y3z1y1x1"))

}

func runLengthEncode(input string) string {
	var result strings.Builder
	for len(input) > 0 {
		firstLetter := input[0]
		inputLength := len(input)
		input = strings.TrimLeft(input, string(firstLetter))
		counter := inputLength - len(input)
		result.WriteString(strconv.Itoa(counter))
		result.WriteString(string(firstLetter))
	}
	return result.String()
}

func runLengthDecode(input string) string {
	var result strings.Builder
	for len(input) > 0 {
		letterIndex := strings.IndexFunc(input, func(r rune) bool { return !unicode.IsDigit(r) })
		multiply, _ := strconv.Atoi(input[:letterIndex])
		result.WriteString(strings.Repeat(string(input[letterIndex]), multiply))
		input = input[letterIndex+1:]
	}
	return result.String()
}

func runLengthEncode2(input string) string {
	var result strings.Builder
	for len(input) > 0 {
		firstLetter := input[0]
		inputLength := len(input)
		input = strings.TrimLeft(input, string(firstLetter))
		counter := inputLength - len(input)
		result.WriteString(string(firstLetter))
		result.WriteString(strconv.Itoa(counter))
	}
	return result.String()
}

func runLengthDecode2(input string) string {
	var result strings.Builder
	for len(input) > 0 {
		letterIndex := strings.IndexFunc(input[1:], func(r rune) bool { return !unicode.IsDigit(r) })
		multiply, _ := strconv.Atoi(input[1:])
		if letterIndex != -1 {
			multiply, _ = strconv.Atoi(input[1 : letterIndex+1])
			result.WriteString(strings.Repeat(string(input[0]), multiply))
			input = input[letterIndex+1:]
		} else {
			result.WriteString(strings.Repeat(string(input[0]), multiply))
			break
		}
	}
	return result.String()
}
