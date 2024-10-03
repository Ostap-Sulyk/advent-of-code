package year2015

import (
	"crypto/md5"
	"fmt"
	"strconv"
	"strings"
)

type Day04 struct{}

func checkMD5Prefix(secretKey string, candidateNumber int, prefix string) bool {
	candidate := secretKey + strconv.Itoa(candidateNumber)
	hash := md5.Sum([]byte(candidate))
	result := fmt.Sprintf("%x", hash)
	return result[:len(prefix)] == prefix
}

func findNumber(secretKey string, numberOfZeros int) int {
	zeros := strings.Repeat("0", numberOfZeros)
	candidateNumber := 1

	for {
		if checkMD5Prefix(secretKey, candidateNumber, zeros) {
			break
		}
		candidateNumber++
	}

	return candidateNumber
}

func (d Day04) SolvePart1() int {
	return findNumber("iwrupvqb", 5)
}

func (d Day04) SolvePart2() int {
	return findNumber("iwrupvqb", 6)
}

func (d Day04) GetName() string {
	return "Day 04"
}
