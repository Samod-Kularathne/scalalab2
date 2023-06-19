object SalaryCalculator {
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Float = {
    val normalRate: Float = 250.0f
    val otRate: Float = 85.0f
    val taxPercentage: Float = 12.0f

    val normalPay: Float = normalHours * normalRate
    val otPay: Float = otHours * otRate
    val totalPay: Float = normalPay + otPay
    val taxAmount: Float = totalPay * (taxPercentage / 100)
    val takeHomeSalary: Float = totalPay - taxAmount

    takeHomeSalary
  }

  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30

    val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
    println(s"The take-home salary is: Rs. $takeHomeSalary")
  }
}
