import java.util.*

fun aVeryBigSum(ar: Array<Long>) = ar.reduce { acc: Long, value: Long -> acc + value }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
