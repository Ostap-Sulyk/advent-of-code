package main

import (
	"fmt"

	"github.com/ostap-sulyk/advent-of-code/utils"
	"github.com/ostap-sulyk/advent-of-code/year2015"
)

func PrintDays(year int, days []utils.Day) {
	fmt.Printf("Year %d:\n", year)
	for _, day := range days {
		fmt.Println(utils.Format(day))
	}
	fmt.Println()
}

func main() {
	year2015Days := []utils.Day{
		year2015.Day01{},
		year2015.Day02{},
		year2015.Day03{},
		// year2015.Day04{},
		year2015.Day05{},
	}

	PrintDays(2015, year2015Days)
}
