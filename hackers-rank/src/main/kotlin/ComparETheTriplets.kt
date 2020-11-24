fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var bobScores = 0
    var aliceScores = 0
    a.forEachIndexed { index, value ->
        if (value != b[index]) {
            if (value > b[index]) {
                aliceScores++
            } else {
                bobScores++
            }
        }
    }
    return mutableListOf(bobScores, aliceScores).toTypedArray()
}

fun main() {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
