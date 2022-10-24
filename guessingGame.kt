import java.util.*

object Lastname04c {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val rand = Random()
        val num = rand.nextInt(100) // generating the random number between 0-99
        var guess: Int
        var counter = 0
        println("Guess a number between 1 and 100: ") // prompting user to enter a number between 1-100
        while (true) {
            guess = `in`.nextInt() // taking user input
            counter++ // incrementing counter for every guess
            if (guess == num) // breaking the loop if the guess is right
                break else if (guess < num) // prompting user with appropriate message if guess is not right
                println("Too low, try again.") else println("Too high, try again.")
        }
        when (counter) {
            1 -> println("Amazing!")
            2, 3 -> println("Expert!")
            4, 5 -> println("Impressive!")
            6, 7 -> println("Very good!")
            8 -> println("Try harder")
            else -> println("you're not very good at this")
        }
    }
}
