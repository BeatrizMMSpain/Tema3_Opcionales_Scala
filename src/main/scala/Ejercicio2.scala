object Ejercicio2 extends App {

  class NumerosModulo {

    object Main {
      def main(args: Array[String]): Unit = {
        imprimeModulo(1000)
      }
    }
  }

    def imprimeModulo(end: Int) {
      modulo100(end)
      modulo200(end)
      /*
      val control1 = false
      control1 == modulo100(end)
      if (control1 == true) {
        val control2 = modulo200(end)
      } else {
        println("No puedo.")
      }
       */


      def modulo100(x: Int): Boolean = {
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

      def modulo200(x: Int): Boolean = {
        var y = 1

        while (y < x + 1) {
          if (y % 200 != 0) {
            y = y + 1
          } else {
            println(y)
            y = y + 1
          }
        }
        true
      }
    }
  override def main(args: Array[String]): Unit = {
    val algo = new NumerosModulo
  }
}



