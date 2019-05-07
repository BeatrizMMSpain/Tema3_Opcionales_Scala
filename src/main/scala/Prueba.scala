object Prueba extends App {
  def buclesuma(x: Int): Boolean = {
    var y = 1

    while (y <= x) {
      if (y % 100 != 0) {
        y = y + 1
      } else {
        println(y)
        y = y + 1
      }
    }
    true
  }



  override def main(args: Array[String]): Unit = {
    val control = Prueba.buclesuma(1000)
    println(control)
  }
}
