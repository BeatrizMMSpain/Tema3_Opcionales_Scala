object Ejercicio2 extends App {


  class NumerosModulo {

    /**
      *   Función que calcula si un número es divisible por 100. Devolverá True si lo es.
      *
      * @param x : Int Número a analizar
      * @return Boolean
      */
    def modulo100(x: Int): Boolean = {
     x % 100 == 0
    }

    /**
      *   Función que calcula si un número es divisible por 200. Devolverá True si lo es.
      *
      * @param x : Int Número a analizar
      * @return Boolean
      */
    def modulo200(x: Int): Boolean = {
      x % 200 == 0
    }

    /**
      *   Clase que imprime un número si imprime la condición de la función que se le pasa.
      * @param f
      * @param end
      */
    def imprimeModulo(f : Int => Boolean, end: Int) {
      for (x <- 1 to end ){
        if ( f(x)){
          println(x)
        }
      }
    }
  }

  override def main(args: Array[String]): Unit = {

    val numMod = new NumerosModulo
    println("Números divisibles por 100")
    numMod.imprimeModulo(numMod.modulo100,1000)
    println("Números divisibles por 200")
    numMod.imprimeModulo(numMod.modulo200,1000)
  }
}



