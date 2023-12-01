fun main() {
    fun part1(input: Sequence<String>): Int = input
        .map { line ->

            val number = charArrayOf(Char.MIN_VALUE, Char.MIN_VALUE)

            for (c in line) {
                if (!c.isDigit()) continue

                if (number[0] == Char.MIN_VALUE) number[0] = c
                number[1] = c
            }

            number.concatToString().toInt()
        }
        .sum()

    fun part2(input: Sequence<String>): Int {
        return input.minOf(String::length)
    }

    // test if implementation meets criteria from the description, like:
    check(useInput("Day01_test", ::part1) == 142)

    useInput("Day01", ::part1).println()
    useInput("Day01", ::part2).println()
}
