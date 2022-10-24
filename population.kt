import java.text.DecimalFormat
import java.util.*

class Population {
    private fun showPopulation(
        dayNum: Int,
        days: Int,
        organisms: Double,
        dailyIncrease: Double
    ): Double //private function each day population display
    {
        return if (dayNum == days) organisms else organisms * dailyIncrease / 100 //caculate population %
    }

    fun displayPopulation(startingOrgnisms: Double, increase: Double, days: Int) {
        val formatter = DecimalFormat("###,###,###,###,###.000000000000")
        var dailyIncrease = startingOrgnisms
        println("Days Organisms")
        println("----------------------------------")
        for (i in 1..days)  //repeating loop fo no.of days
        {
            dailyIncrease += showPopulation(
                i,
                days,
                startingOrgnisms,
                increase
            ) //calling private function to display each population
            var startingOrganisms = dailyIncrease
            println(i.toString() + " " + formatter.format(dailyIncrease)) //printing the output
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var startingOrgnisms: Double
            var increase: Double
            var days: Int
            val p1 = Population() //create object of Population
            val s = Scanner(System.`in`) //create Scanner object for reading
            while (true) //repeat loop,if population size entered is <2
            {
                println("Enter the starting number of organisms: ")
                startingOrgnisms = s.nextDouble() //input population
                if (startingOrgnisms >= 2) break //if valid input exit loop
                println("Invalid! enter more than 2 for population") //otherwise error message and repeat loop
            }
            while (true) //repeat loop, if average increase <0
            {
                println("Enter the daily Increase : ")
                increase = s.nextDouble() //input increase average value
                if (increase > 0) break //if input is valid then exit loop
                println("Invalid! enter greater than 0 for daily increase") //otherwise error message and repeat loop
            }
            while (true) //loop for validating no.of days
            {
                println("Enter the number of days organisms will multiply : ")
                days = s.nextInt() //input days
                if (days > 0) break //if right input exit loop
                println("Please! enter greater than 0 for the number of days organisms will multiply ")
                //otherwise error and repeat the loop
            }
            p1.displayPopulation(startingOrgnisms, increase, days) //calling function to display all
        }
    }
}
