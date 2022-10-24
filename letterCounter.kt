import java.util.*

object LetterCounter {
    @JvmStatic
    fun main(args: Array<String>) {
        // Declare variable to store string
        val text: String

        // Declare var to store character
        val character: Char

        // Create Scanner object
        val keyboard = Scanner(System.`in`)

        // Prompt the user for String input
        println("Enter a string: ")
        text = keyboard.nextLine()

        // Prompt the user for Char input
        println("Enter a character: ")
        character = keyboard.nextLine()[0]

        // Declare counter variable
        var count = 0

        // Construct for loop to calculate the number of
        // times that the specified character appears in the string.
        for (i in 0 until text.length) {
            if (text[i] == character) {
                count += 1
            }
        }
        // Diplay the number of times the character appears
        println("The character appears $count times")
    }
}
