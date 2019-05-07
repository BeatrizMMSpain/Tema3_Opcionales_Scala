import Figuras.CalcularAreasFiguras.{Circulo, Rectangulo, Triangulo, compararRectanguloConLimite, compararRectanguloTriangulo}
import scala.io.StdIn

object Ejercicio1 extends App {

  override def main(args: Array[String]): Unit = {
    //Opciones a elegir por el usuario
    val RECTANGULO: Int = 1
    val CIRCULO: Int = 2
    val TRIANGULO: Int = 3
    val COMPARAR: Int = 4
    val SALIR: Int = 5

    //Inicialización de variables
    var operacion: Int = 0
    var salir: Boolean = false
    val rectangulo: Rectangulo = Rectangulo()
    val circulo: Circulo = Circulo()
    val triangulo: Triangulo = Triangulo()

    while (!salir) {
      println("Elige el tipo de figura que quieres consultar: ")
      println("1 - Rectángulo")
      println("2 - Círculo")
      println("3 - Triángulo")
      println("4 - Comparar")
      println("5 - Salir")
      operacion = StdIn.readInt()

      operacion match {
        case RECTANGULO =>
          println("Rectangulo:" + rectangulo.color)
          println("Base:" + rectangulo.base)
          println("Altura:" + rectangulo.altura)
          println("Area:" + rectangulo.area)
        case CIRCULO =>
          println("Circulo:" + circulo.color)
          println("Radio:" + circulo.radio)
          println("Area:" + rectangulo.area)
        case TRIANGULO =>
          println("Triangulo:" + triangulo.color)
          println("Base:" + triangulo.base)
          println("Altura:" + triangulo.altura)
          println("Area:" + triangulo.area)

        case COMPARAR =>
          if (compararRectanguloTriangulo(rectangulo, triangulo)) {
            println("El Rectangulo tiene una área mayor que el triangulo")
          } else {
            println("El Triangulo tiene una área mayor que el rectangulo")
          }
          if (compararRectanguloConLimite(rectangulo, 5)) {
            println("El Rectangulo es mayor al limite 5")
          } else {
            println("El Rectangulo es menor al limite 5")
          }

        case SALIR =>
          println("Has salido del programa")
          salir = true
      }
    }
  }


}
