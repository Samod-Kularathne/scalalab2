object VariableExpressions {
  def main(args: Array[String]): Unit = {
    var i, j, m, n, k: Int = 0
    var f, g: Float = 0.0f
    var c: Char = ' '

    k = 2
    i = 2
    j = 2
    m = 5
    n = 5
    f = 12.0f
    g = 4.0f
    c = 'X'

    val resultA = k + 12 * m
    val resultB = m / j
    val resultC = n % j
    val resultD = m / j * j
    val resultE = f + 10 * 5 + g
    
    i += 1
    val resultF = i * n

    println("Expression Results:")
    println(s"a) k + 12 * m = $resultA")
    println(s"b) m / j = $resultB")
    println(s"c) n % j = $resultC")
    println(s"d) m / j * j = $resultD")
    println(s"e) f + 10*5 + g = $resultE")
    println(s"f) ++i * n = $resultF")
  }
}
