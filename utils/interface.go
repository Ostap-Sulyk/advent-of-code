package utils

import (
	"fmt"
	"strconv"
)

type Day interface {
	SolvePart1() int
	SolvePart2() int
	GetName() string
}

func Format(day Day) string {
	green := "\u001B[32m"
	reset := "\u001B[0m"

	return fmt.Sprintf("%-10s Answer 1 = %s%-10s%s%15s Answer 2 = %s%-10s%s",
		day.GetName(),
		green, strconv.Itoa(day.SolvePart1()), reset,
		"", green, strconv.Itoa(day.SolvePart2()), reset)
}
