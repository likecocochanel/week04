import java.util.*

object BarChart {
    @JvmStatic
    fun main(args: Array<String>) {
        val store = DoubleArray(5)
        val userInput = Scanner(System.`in`)
        for (i in 0..4) {
            System.out.printf("Enter today\'s sales for store %d: ", i + 1)
            store[i] = userInput.nextDouble()
        }
        println("\nSALES BAR CHART")
        for (i in 0..4) {
            System.out.printf("Store %d: ", i + 1)
            var c = 0
            while (c < store[i] / 100) {
                print("*")
                c++
            }
            println()
        }
        userInput.close()
    }
}
