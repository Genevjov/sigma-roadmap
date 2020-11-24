import java.util.*

fun simpleArraySum(ar: Array<Int>) = ar.reduce { acc, i -> acc + i }

fun main() {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
