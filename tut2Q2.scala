object VariableExpressions {
  def main(args: Array[String]): Unit = {
    var a, b, c, d: Int = 0
    var k: Float = 0.0f
    var g: Float = 0.0f

    a = 2
    b = 3
    c = 4
    d = 5
    k = 4.3f

    println("Expression Results:")
    println(s"a) ${-(-b) * a + c * d - (-1)}")
    println(s"b) ${val temp = a; a += 1; temp}")
    println(s"c) ${-2 * (g - k) + c}")
    println(s"d) ${val temp = c; c += 1; temp}")
    println(s"e) ${val tempC = c; val tempA = a; a += 1; c = tempC + 1; tempC * tempA}")
  }
}
