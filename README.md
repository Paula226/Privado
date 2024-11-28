Voy a explicarte este código línea por línea:

### 1. **Función Derivada (Diferencia Adelante)**
```scala
def derivadaDiferenciaAdelante(f: Double => Double, x: Double, h: Double): Option[Double] = {
```
- Definimos la función `derivadaDiferenciaAdelante`, que toma tres parámetros:
  - `f`: Una función que acepta un `Double` como argumento y devuelve un `Double` (la función de la cual queremos derivar).
  - `x`: El punto donde se evalúa la derivada.
  - `h`: Un valor pequeño utilizado para aproximar la derivada.

```scala
  try {
    if (h == 0) throw new IllegalArgumentException("El valor de 'h' no puede ser 0.")
```
- Usamos un bloque `try` para manejar posibles excepciones. Si `h` es igual a 0, lanzamos una excepción `IllegalArgumentException`, ya que no podemos dividir por cero.

```scala
    Some((f(x + h) - f(x)) / h)
```
- Calculamos la derivada utilizando la fórmula de la **diferencia adelante**: \(\frac{f(x+h) - f(x)}{h}\). Esta aproximación utiliza el valor de la función en \(x+h\) y \(x\). El resultado se envuelve en `Some`, que indica que la operación fue exitosa.

```scala
  } catch {
    case e: Exception =>
      println(s"Error en derivadaDiferenciaAdelante: ${e.getMessage}")
      None
  }
}
```
- Si ocurre alguna excepción, la capturamos e imprimimos el mensaje de error. Si hay un error, la función devuelve `None`, que indica que el cálculo de la derivada no pudo realizarse.

### 2. **Función Derivada (Diferencia Atrás)**
```scala
def derivadaDiferenciaAtras(f: Double => Double, x: Double, h: Double): Option[Double] = {
```
- Esta es otra función similar a la anterior, pero usa la fórmula de **diferencia atrás** para calcular la derivada. Acepta los mismos parámetros.

```scala
  try {
    if (h == 0) throw new IllegalArgumentException("El valor de 'h' no puede ser 0.")
```
- Igual que antes, verificamos que `h` no sea cero para evitar un error de división por cero.

```scala
    Some((f(x) - f(x - h)) / h)
```
- Calculamos la derivada utilizando la fórmula de **diferencia atrás**: \(\frac{f(x) - f(x-h)}{h}\), que usa el valor de la función en \(x\) y \(x-h\). El resultado se devuelve dentro de un `Some`.

```scala
  } catch {
    case e: Exception =>
      println(s"Error en derivadaDiferenciaAtras: ${e.getMessage}")
      None
  }
}
```
- Capturamos cualquier excepción que ocurra y la manejamos imprimiendo un mensaje de error. Si hay un error, se devuelve `None`.

### 3. **Función Derivada (Diferencia Central)**
```scala
def derivadaDiferenciaCentral(f: Double => Double, x: Double, h: Double): Option[Double] = {
```
- Esta función utiliza la **diferencia central** para calcular la derivada. Acepta los mismos parámetros que las funciones anteriores.

```scala
  try {
    if (h == 0) throw new IllegalArgumentException("El valor de 'h' no puede ser 0.")
```
- Verificamos nuevamente que `h` no sea cero.

```scala
    Some((f(x + h) - f(x - h)) / (2 * h))
```
- Calculamos la derivada utilizando la fórmula de **diferencia central**: \(\frac{f(x+h) - f(x-h)}{2h}\), que es más precisa que las otras dos porque considera los valores de \(f(x+h)\) y \(f(x-h)\). El resultado se devuelve dentro de un `Some`.

```scala
  } catch {
    case e: Exception =>
      println(s"Error en derivadaDiferenciaCentral: ${e.getMessage}")
      None
  }
}
```
- Como en las funciones anteriores, si ocurre un error, lo capturamos e imprimimos el mensaje de error. Si algo sale mal, la función devuelve `None`.

### 4. **Función para Calcular el Error**
```scala
def calcularError(valorReal: Double, valorAproximado: Double): Double = {
  math.abs(valorReal - valorAproximado)
}
```
- Esta función calcula el error absoluto entre el valor real (la derivada analítica) y el valor aproximado (la derivada calculada numéricamente).
- Usamos `math.abs` para obtener el valor absoluto de la diferencia, ya que el error debe ser siempre positivo.

### 5. **Función Principal**
```scala
def main(args: Array[String]): Unit = {
```
- La función `main` es el punto de entrada del programa. Dentro de esta función, definimos las funciones a analizar y realizamos los cálculos.

```scala
  val f1 = (x: Double) => x * x + 3 * x + 5
  val derAnalitica1 = 7.0 // Derivada de f1 en x = 2.0
```
- Definimos la función `f1(x) = x^2 + 3x + 5` y su derivada analítica en \(x = 2\), que es `7.0` (la derivada de \(x^2 + 3x + 5\) es \(2x + 3\), y al evaluar en \(x = 2\) obtenemos 7).

```scala
  val f2 = (x: Double) => Math.sin(x)
  val derAnalitica2 = Math.sqrt(2) / 2 // Derivada de f2 en x = π/4
```
- Definimos la función `f2(x) = sin(x)` y su derivada analítica en \(x = \pi/4\), que es \(\frac{\sqrt{2}}{2}\).

```scala
  val f3 = (x: Double) => Math.exp(x)
  val derAnalitica3 = Math.exp(1) // Derivada de f3 en x = 1.0
```
- Definimos la función `f3(x) = exp(x)` y su derivada analítica en \(x = 1\), que es \(exp(1)\) (el valor de \(e\), la base de los logaritmos naturales).

```scala
  val h = 0.01 // Valor de h para los cálculos de derivada
```
- Establecemos el valor de `h = 0.01`, que es el incremento pequeño que se usará para aproximar la derivada en los métodos numéricos.

### 6. **Cálculos de Derivadas y Errores**
```scala
  val resultados = List(
    (f1, derAnalitica1, 2.0),
    (f2, derAnalitica2, Math.PI / 4),
    (f3, derAnalitica3, 1.0)
  ).map { case (f, derAnalitica, x) =>
```
- Creamos una lista de tuplas con la función, la derivada analítica y el punto de evaluación \(x\) para cada una de las funciones. Luego, aplicamos `map` para calcular las derivadas y errores para cada caso.

```scala
    val derivadaAdelante = derivadaDiferenciaAdelante(f, x, h)
    val derivadaAtras = derivadaDiferenciaAtras(f, x, h)
    val derivadaCentral = derivadaDiferenciaCentral(f, x, h)
```
- Calculamos las derivadas aproximadas para cada función utilizando los tres métodos: diferencia adelante, atrás y central.

```scala
    val errorAdelante = derivadaAdelante.map(calcularError(derAnalitica, _)).getOrElse(Double.NaN)
    val errorAtras = derivadaAtras.map(calcularError(derAnalitica, _)).getOrElse(Double.NaN)
    val errorCentral = derivadaCentral.map(calcularError(derAnalitica, _)).getOrElse(Double.NaN)
```
- Calculamos el error para cada derivada aproximada. Usamos `map` para calcular el error si la derivada fue calculada correctamente, y si no, usamos `getOrElse` para asignar `Double.NaN` (que indica que no se pudo calcular la derivada).

```scala
    (derAnalitica, derivadaAdelante, errorAdelante, derivadaAtras, errorAtras, derivadaCentral, errorCentral)
  }
```
- Retornamos una tupla con la derivada analítica, las tres derivadas aproximadas y sus errores para cada función.

### 7. **Impresión de Resultados**
```scala
  resultados.zipWithIndex.foreach { case ((derAnalitica, adelante, errorAdelante, atras, errorAtras, central, errorCentral), idx

) =>
    println(s"\nFunción ${idx + 1}:")
    println(f" - Derivada analítica: $derAnalitica%.10f")
    println(f" - Derivada (Adelante): ${adelante.getOrElse("Error")}, Error: $errorAdelante%.10f")
    println(f" - Derivada (Atrás): ${atras.getOrElse("Error")}, Error: $errorAtras%.10f")
    println(f" - Derivada (Central): ${central.getOrElse("Error")}, Error: $errorCentral%.10f")
  }
}
```
- Iteramos sobre los resultados calculados. Para cada función, imprimimos:
  - La derivada analítica.
  - Las derivadas aproximadas con sus errores.
- Usamos `getOrElse` para manejar casos donde no se pudo calcular una derivada.

### Resumen:
Este código calcula las derivadas de varias funciones en un punto utilizando tres métodos numéricos: **diferencia adelante**, **diferencia atrás** y **diferencia central**. También calcula el error entre las derivadas aproximadas y las derivadas analíticas, y luego imprime los resultados para cada función.
