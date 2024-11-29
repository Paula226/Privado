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
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
- ¡Claro! Vamos a analizar cada ejercicio detalladamente para explicar **cada parte del código** y **su propósito**. Esto te ayudará a entender para qué sirve cada "cosita" en Scala.

---

## **Ejercicio 1: Uso práctico de `Option`**
```scala
val numeros = List(1, 2, 3, 4, 5)

def buscarYCuadrado(numero: Int): Option[Int] =
  numeros.find(_ == numero).map(x => x * x)

println(buscarYCuadrado(3))  // Some(9)
println(buscarYCuadrado(10)) // None
```

### Detalle por línea:
1. **`val numeros = List(1, 2, 3, 4, 5)`**:
   - Define una lista inmutable con números enteros del 1 al 5.
   - Una lista es una colección de elementos, como un array, pero inmutable (no puedes modificarla directamente).

2. **`def buscarYCuadrado(numero: Int): Option[Int]`**:
   - Declara una función llamada `buscarYCuadrado` que toma un entero (`numero`) como entrada.
   - Devuelve un `Option[Int]`, que puede ser:
     - `Some(valor)` si el número se encuentra.
     - `None` si el número no está en la lista.

3. **`numeros.find(_ == numero)`**:
   - Busca el primer elemento de la lista que sea igual al `numero`.
   - **`_`**: Representa cada elemento de la lista. Es una forma compacta de escribir funciones anónimas.
   - Devuelve `Some(numero)` si lo encuentra, o `None` si no lo hace.

4. **`.map(x => x * x)`**:
   - Si `find` encuentra un número, `map` aplica una función sobre él.
   - En este caso, la función toma el número `x` y devuelve su cuadrado (`x * x`).
   - Si `find` devuelve `None`, `map` no hace nada.

5. **`println(buscarYCuadrado(3))`**:
   - Llama a la función con el número `3`. Como está en la lista, devuelve `Some(9)`.

6. **`println(buscarYCuadrado(10))`**:
   - Llama a la función con el número `10`. Como no está en la lista, devuelve `None`.

---

## **Ejercicio 2: Manejo seguro de excepciones con `Try`**
```scala
import scala.util.{Try, Success, Failure}
import scala.io.Source

def contarLineas(ruta: String): Try[Int] = Try {
  val fuente = Source.fromFile(ruta)
  try {
    fuente.getLines().size
  } finally {
    fuente.close()
  }
}

contarLineas("archivo.txt") match {
  case Success(lineas) => println(s"Líneas: $lineas")
  case Failure(e) => println(s"Error: ${e.getMessage}")
}
```

### Detalle por línea:
1. **`import scala.util.{Try, Success, Failure}`**:
   - Importa herramientas para manejar errores de manera segura:
     - `Try`: Intenta ejecutar un bloque de código.
     - `Success`: Indica que la operación fue exitosa.
     - `Failure`: Captura excepciones si algo falla.

2. **`import scala.io.Source`**:
   - Importa utilidades para trabajar con archivos (lectura de texto, etc.).

3. **`def contarLineas(ruta: String): Try[Int]`**:
   - Declara una función que recibe una ruta de archivo (`String`) y devuelve un `Try[Int]`.
   - El `Int` representa el número de líneas del archivo.

4. **`val fuente = Source.fromFile(ruta)`**:
   - Abre el archivo especificado en `ruta`. Esto puede fallar si el archivo no existe.

5. **`try { fuente.getLines().size }`**:
   - `fuente.getLines()`: Obtiene las líneas del archivo como un iterador.
   - `.size`: Cuenta cuántas líneas hay.

6. **`finally { fuente.close() }`**:
   - Asegura que el archivo se cierre después de leerlo, incluso si ocurre un error.

7. **`match`**:
   - **`case Success(lineas)`**: Si la operación es exitosa, imprime el número de líneas.
   - **`case Failure(e)`**: Si ocurre un error, imprime el mensaje de la excepción (`e.getMessage`).

---

## **Ejercicio 3: Uso de `Either` para validar datos**
```scala
def validarNumero(numero: Int): Either[String, Int] =
  if (numero > 0) Right(numero)
  else Left("Número no válido: debe ser mayor a 0")

println(validarNumero(5))  // Right(5)
println(validarNumero(-3)) // Left("Número no válido: debe ser mayor a 0")
```

### Detalle por línea:
1. **`def validarNumero(numero: Int): Either[String, Int]`**:
   - Declara una función que devuelve un `Either`.
   - Un `Either` tiene dos posibles valores:
     - `Right(valor)`: Representa un resultado exitoso.
     - `Left(valor)`: Representa un error o resultado alternativo.

2. **`if (numero > 0)`**:
   - Verifica si el número es mayor a 0.

3. **`Right(numero)`**:
   - Devuelve el número como un resultado exitoso.

4. **`Left("Número no válido")`**:
   - Devuelve un mensaje de error si el número no es válido.

5. **`println(validarNumero(5))`**:
   - Llama a la función con `5`, que es válido, y devuelve `Right(5)`.

6. **`println(validarNumero(-3))`**:
   - Llama a la función con `-3`, que no es válido, y devuelve `Left("Número no válido")`.

---

## **Ejercicio 4: Transformaciones con listas**
```scala
val estudiantes = List(
  ("Alvarado", "Pablo", 9.0),
  ("Arciniegas", "Elizabeth", 7.2),
  ("Lopez", "Carlos", 8.5)
)

val nombresAltas = estudiantes.filter(_._3 > 8).map(e => s"${e._1} ${e._2}")
val promedio = estudiantes.map(_._3).sum / estudiantes.length

println(nombresAltas) // List("Alvarado Pablo", "Lopez Carlos")
println(f"Promedio: $promedio%.2f") // Promedio: 8.23
```

### Detalle por línea:
1. **`val estudiantes = List(...)`**:
   - Una lista de tuplas que contiene:
     - Apellido, nombre y calificación del estudiante.

2. **`filter(_._3 > 8)`**:
   - Filtra los estudiantes con calificaciones mayores a 8.
   - **`_._3`**: Selecciona el tercer elemento de cada tupla (la calificación).

3. **`map(e => s"${e._1} ${e._2}")`**:
   - Transforma las tuplas restantes en nombres completos usando interpolación de cadenas (`s`).

4. **`map(_._3).sum / estudiantes.length`**:
   - Obtiene las calificaciones (`_._3`), suma los valores y calcula el promedio.

5. **`f"Promedio: $promedio%.2f"`**:
   - Imprime el promedio con dos decimales (`%.2f`).

---
¡Claro! Vamos a desglosar este código paso a paso para entender exactamente cómo funciona. El propósito principal del código es **convertir temperaturas de Fahrenheit a Celsius**, pero también maneja valores no válidos (temperaturas inferiores al cero absoluto).

---

### **Código**
```scala
//1._Convertir Fahrenheit a Celsius
def convertirCelsius(fahrenheit: Double): Option[Double] = {
  if (fahrenheit < -459.67) None
  else Some((fahrenheit - 32) * 5 / 9)
}

println(convertirCelsius(-500))  // Resultado esperado: None
println(convertirCelsius(499.58)) // Resultado esperado: Some(259.766...)
```

---

### **Desglose por partes**

#### **1. Definición de la función**
```scala
def convertirCelsius(fahrenheit: Double): Option[Double] = {
```

- **`def convertirCelsius`**: Define una función llamada `convertirCelsius`.
- **`fahrenheit: Double`**: Recibe como parámetro un número decimal (`Double`) que representa la temperatura en Fahrenheit.
- **`Option[Double]`**: La función devuelve un resultado opcional:
  - `Some(valor)`: Si la temperatura es válida, devuelve el resultado de la conversión.
  - `None`: Si la temperatura es inválida (menor al límite físico del cero absoluto, -459.67°F).

---

#### **2. Validación del parámetro**
```scala
if (fahrenheit < -459.67) None
```

- **`fahrenheit < -459.67`**:
  - El cero absoluto es -459.67°F, por lo que cualquier valor menor no tiene sentido físico.
  - Si la temperatura es menor a este valor, la función devuelve `None`, indicando que el valor es inválido.

---

#### **3. Cálculo de la conversión**
```scala
else Some((fahrenheit - 32) * 5 / 9)
```

- **`fahrenheit - 32`**: Convierte la temperatura Fahrenheit al equivalente "relativo" en Celsius (el punto de congelación del agua en Fahrenheit es 32).
- **`* 5 / 9`**: Aplica la fórmula para ajustar la escala de Fahrenheit a Celsius.
- **`Some(...)`**: Si el valor de Fahrenheit es válido, devuelve el resultado envuelto en un `Some` para indicar éxito.

---

#### **4. Uso de la función**
```scala
println(convertirCelsius(-500))  // Resultado esperado: None
println(convertirCelsius(499.58)) // Resultado esperado: Some(259.766...)
```

1. **`convertirCelsius(-500)`**:
   - Como `-500 < -459.67`, la función devuelve `None`.
   - Esto indica que el valor de entrada no es válido.

2. **`convertirCelsius(499.58)`**:
   - Se evalúa la fórmula:  
     \[
     \text{Celsius} = (499.58 - 32) \times \frac{5}{9} \approx 259.766...
     \]
   - La función devuelve `Some(259.766...)`, indicando que la conversión fue exitosa.

---

### **¿Por qué usar `Option`?**

El uso de `Option` en esta función tiene varias ventajas:
1. **Manejo seguro de valores inválidos**:
   - En lugar de devolver un número inválido o lanzar una excepción, devuelve `None`, lo que permite manejar el error de manera funcional.
2. **Compatibilidad con transformaciones funcionales**:
   - Puedes encadenar operaciones como `map`, `flatMap`, etc., para procesar resultados sin tener que verificar explícitamente si son válidos o no.

---

### **¿Cómo usar esta función?**
Si necesitas trabajar con el resultado, puedes usar un `match` o métodos como `getOrElse`:

```scala
val resultado = convertirCelsius(499.58)
println(resultado.getOrElse("Valor inválido")) // Muestra 259.766... o "Valor inválido"
```

¿Te gustaría ver más ejemplos prácticos o agregar validaciones adicionales? 😊

### Resumen:
Este código calcula las derivadas de varias funciones en un punto utilizando tres métodos numéricos: **diferencia adelante**, **diferencia atrás** y **diferencia central**. También calcula el error entre las derivadas aproximadas y las derivadas analíticas, y luego imprime los resultados para cada función.
