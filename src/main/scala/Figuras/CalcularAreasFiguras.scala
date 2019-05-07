package object Figuras {

  object CalcularAreasFiguras extends App {

    case class Rectangulo(base: Float = 2, altura: Float = 3, color: String = "Azul") {
      var area = calcularArea(base, altura)

      def calcularArea(b: Float, a: Float): Float = b * a
    }

    case class Triangulo(base: Float = 4, altura: Float = 2, color: String = "verde") {
      var area = calcularArea(base, altura)

      def calcularArea(b: Float, a: Float): Float = b * a / 2
    }

    case class Circulo(radio: Float = 2, color: String = "rojo") {
      var area = calcularArea(radio)

      def calcularArea(r: Float): Float = Math.PI.toFloat * r * r
    }

    def compararRectanguloTriangulo(rectangulo: Rectangulo, triangulo: Triangulo): Boolean =
      rectangulo.area > triangulo.area

    def compararRectanguloConLimite(rectangulo: Rectangulo, limite: Int): Boolean =
      rectangulo.area > limite

  }

}