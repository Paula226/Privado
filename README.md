# Documentación del Proceso

## Índice
1. [Descripción de los Datos](#descripción-de-los-datos)
2. [Lectura del CSV](#lectura-del-csv)
3. [Análisis Exploratorio](#análisis-exploratorio)
4. [Limpieza](#limpieza)
5. [Trabajo con Base de Datos](#trabajo-con-base-de-datos)

---

## Descripción de los Datos
## Tablas de Datos 


| Nombre de Columna         | Tipo                     | Propósito                                        | Observaciones                                      |
|---------------------------|--------------------------|--------------------------------------------------|---------------------------------------------------|
| `adult`                   | Booleano (true/false)    | Determina si la película está destinada a un público adulto.  | Los valores posibles son "true" o "false".        |
| `belongs_to_collection`   | Cadena de texto (JSON)   | Información sobre la colección a la que pertenece la película. | Puede ser un objeto JSON o estar vacío.           |
| `budget`                  | entero            | Indica el presupuesto de la película en dólares.  | En algunos casos puede ser "0".                   |
| `genres`                  | Cadena de texto (JSON)   | Listado de géneros de la película.                | Es un array JSON que contiene objetos de géneros. |
| `homepage`                | Cadena          | URL oficial del sitio web de la película.        | Este campo puede estar vacío.                     |
| `id`                      | entero            | Identificador único de la película en la base de datos. | Actúa como clave primaria.                        |
| `imdb_id`                 | Cadena         | ID de la película en IMDb.                       | Formato "tt#####".                                |
| `original_language`       | Cadena          | Lengua original en que se realizó la película.   | Usualmente es un código de dos letras según el estándar ISO 639-1 (por ejemplo, 'en' para inglés, 'es' para español).|
| `original_title`          | Cadena           | Título original de la película antes de cualquier cambio. | Puede diferir del título oficial en algunos casos.|
| `overview`                | Cadena           | Descripción breve de la trama de la película.    | Puede estar vacío.                                |
| `popularity`              | Número decimal           | Mide el nivel de popularidad de la película.     | Es una escala relativa en base a TMDb.           |
| `poster_path`             | Cadena           | Ruta que dirige al póster de la película.        | Debe usarse con la URL base de TMDb para acceso.  |
| `production_companies`    | Cadena de texto (JSON)   | Lista de compañías que participaron en la producción. | Es un array JSON con detalles de las compañías.   |
| `production_countries`    | Cadena de texto (JSON)   | Países en los que se produjo la película.        | Es un array JSON con objetos representando países.|
| `release_date`            | entero            | Fecha en la que se estrenó la película.          | En formato "YYYY-MM-DD".                          |
| `revenue`                 | entero            | Ingresos generados por la película.              | Puede ser "0" si no ha generado ingresos.         |
| `runtime`                 | Número decimal           | Duración total de la película en minutos.        | Puede ser "0" si no se especifica la duración.    |
| `spoken_languages`        | Cadena de texto (JSON)   | Idiomas hablados en la película.                 | Es un array JSON con códigos de los idiomas.      |
| `status`                  | Cadena          | Estado actual de la película en producción.      | Ejemplos: "Released", "Post Production".          |
| `tagline`                 | Cadena          | Eslogan o lema asociado a la película.           | Puede estar vacío.                                |
| `title`                   | Cadena          | Nombre comercial utilizado para la película.     | Es el título usado para su promoción y distribución.|
| `video`                   | Booleano (true/false)    | Indica si existe contenido de video relacionado con la película. | Generalmente tiene el valor "false".             |
| `vote_average`            | Número decimal           | Promedio de las calificaciones recibidas.        | Utilizado para evaluar el éxito de la película.   |
| `vote_count`              | Número entero            | Número total de votos recibidos por la película. | Puede ser "0" si no se ha votado aún.             |
| `keywords`                | Cadena de texto (JSON)   | Palabras clave relacionadas con la película.     | Es un array JSON de palabras clave.               |
| `cast`                    | Cadena de texto (JSON)   | Lista de los actores principales de la película. | Es un array JSON con la información de los actores.|
| `crew`                    | Cadena de texto (JSON)   | Información del equipo técnico y de producción.  | Es un array JSON con datos del equipo de producción.|
| `ratings`                 | Cadena de texto (JSON)   | Opiniones y calificaciones de los usuarios.      | Incluye usuarios, sus calificaciones y fechas.    |


## Lectura del CSV
Se detalla el proceso de carga de datos desde un archivo CSV, incluyendo las librerías utilizadas.

## Análisis Exploratorio
Análisis inicial de los datos, distribución de variables, estadísticos básicos y visualización.

## Limpieza
Proceso de limpieza de datos, tratamiento de valores nulos, duplicados y conversión de tipos de datos.

## Trabajo con Base de Datos
Explicación sobre cómo almacenar, consultar y manipular los datos dentro de una base de datos.
