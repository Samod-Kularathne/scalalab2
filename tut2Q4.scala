object MovieTheaterProfit {
  def calculateProfit(ticketPrice: Float): Float = {
    val basePrice: Float = 15.0f
    val baseAttendance: Int = 120
    val attendanceIncrease: Int = 20
    val costPerPerformance: Float = 500.0f
    val costPerAttendee: Float = 3.0f

    val attendance: Int = baseAttendance + ((basePrice - ticketPrice) / 5) * attendanceIncrease
    val revenue: Float = ticketPrice * attendance
    val cost: Float = costPerPerformance + costPerAttendee * attendance
    val profit: Float = revenue - cost

    profit
  }

  def main(args: Array[String]): Unit = {
    val ticketPriceRange: Range.Inclusive = 5 to 25  // Range of ticket prices to test
    var bestPrice: Float = 0.0f
    var maxProfit: Float = Float.MinValue

    ticketPriceRange.foreach { price =>
      val profit = calculateProfit(price)
      if (profit > maxProfit) {
        maxProfit = profit
        bestPrice = price
      }
    }

    println(s"The best ticket price for maximizing profit is: Rs. $bestPrice")
    println(s"The maximum profit at this ticket price is: Rs. $maxProfit")
  }
}
