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
![image](https://github.com/user-attachments/assets/c1c67967-b407-414c-8281-d601153f028e)
## Análisis de Datos Textuales

| **Etiquetas de fila**                                                  | **Cuenta de original_title** |
|------------------------------------------------------------------------|------------------------------|
| à¤°à¤•à¥à¤¤                                                           | 1                            |
| Ã€ travers la forÃªt                                                   | 1                            |
| All Access: Front Row. Backstage. Live!                                | 1                            |
| Ant-Man                                                                | 1                            |
| August Evening                                                         | 1                            |
| Baby Snakes                                                            | 1                            |
| Bachelor Flat                                                          | 1                            |
| Boris and Natasha                                                      | 1                            |
| Cambridge Spies                                                        | 1                            |
| Camp de Thiaroye                                                       | 1                            |
| Carcasses                                                              | 1                            |
| China Gate                                                             | 1                            |
| Copper Canyon                                                          | 1                            |
| Ð¨Ð¿Ð¸Ð¾Ð½                                                             | 1                            |
| Ð‘Ð°Ð±Ð½Ð¸Ðº                                                           | 1                            |
| Dear Heart                                                             | 1                            |
| Dumb and Dumber To                                                     | 1                            |
| é’çº¢                                                                 | 1                            |
| Eddie: The Sleepwalking Cannibal                                       | 1                            |
| El tren de la memoria                                                  | 1                            |
| Elsker dig for evigt                                                   | 1                            |
| Fate Is the Hunter                                                     | 1                            |
| Fighting Back                                                          | 1                            |
| Flight Command                                                         | 1                            |
| Follow Me: The Yoni Netanyahu Story                                    | 1                            |
| Gertie the Dinosaur                                                    | 1                            |
| God is the Bigger Elvis                                                | 1                            |
| Grandma Lo-Fi                                                          | 1                            |
| Harold's Going Stiff                                                   | 1                            |
| Heavenly Creatures                                                     | 1                            |
| Hillside Cannibals                                                     | 1                            |
| HistÃ³rias que sÃ³ Existem Quando Lembradas                            | 1                            |
| Holy Motors                                                            | 1                            |
| Hotel Reserve                                                          | 1                            |
| I cacciatori del cobra d'oro                                           | 1                            |
| Î†Î´Î¹ÎºÎ¿Ï‚ ÎšÏŒÏƒÎ¼Î¿Ï‚                                              | 1                            |
| Informant                                                              | 1                            |
| Julian Po                                                              | 1                            |
| La fille seule                                                         | 1                            |
| L'AntisÃ©mite                                                          | 1                            |
| Lekarstwo na miÅ‚oÅ›Ä‡                                                 | 1                            |
| Lenny Bruce: Swear to Tell the Truth                                   | 1                            |
| Live Once, Die Twice                                                   | 1                            |
| Liverpool                                                              | 1                            |
| Lobos de Arga                                                          | 1                            |
| Lola Versus                                                            | 1                            |
| Madea's Witness Protection                                             | 1                            |
| Min Avatar og mig                                                      | 1                            |
| Mock Up on Mu                                                          | 1                            |
| Mulholland Drive                                                       | 1                            |
| Nazis at the Center of the Earth                                       | 1                            |
| No Way Home                                                            | 1                            |
| Nuit #1                                                                | 1                            |
| Outpost: Black Sun                                                     | 1                            |
| Quartet                                                                | 1                            |
| Quints                                                                 | 1                            |
| Rabbit Test                                                            | 1                            |
| Radiostars                                                             | 1                            |
| Rage                                                                   | 1                            |
| Return Home                                                            | 1                            |
| Rok ÄÃ¡bla                                                            | 1                            |
| Sam Peckinpah: Man of Iron                                             | 1                            |
| Scarlett                                                               | 1                            |
| Sebastian Maniscalco: What's Wrong with People?                        | 1                            |
| Second Best                                                            | 1                            |
| See Here, Private Hargrove                                             | 1                            |
| Seven                                                                  | 1                            |
| Something to Sing About                                                | 1                            |
| Spinning Boris                                                         | 1                            |
| Stormy Weather                                                         | 1                            |
| Superman vs. The Elite                                                 | 1                            |
| Suspiros de EspaÃ±a                                                    | 1                            |
| Taxi Driver                                                            | 1                            |
| The Butterfly Room                                                     | 1                            |
| The Deep Six                                                           | 1                            |
| The Fourth Dimension                                                   | 1                            |
| The Giant Mechanical Man                                               | 1                            |
| The Gnomes' Great Adventure                                            | 1                            |
| The Great Los Angeles Earthquake                                       | 1                            |
| The Hunger Games: Catching Fire                                        | 1                            |
| The Kill Hole                                                          | 1                            |
| The Magnificent Yankee                                                 | 1                            |
| The Mountain Road                                                      | 1                            |
| The Patent Leather Kid                                                 | 1                            |
| Traces of Red                                                          | 1                            |
| Trapped in the Closet: Chapters 1-12                                   | 1                            |
| Une bouteille Ã  la mer                                                | 1                            |
| Unguarded                                                              | 1                            |
| Unicorn City                                                           | 1                            |
| Ushiro kara mae kara                                                   | 1                            |
| Verfolkt                                                               | 1                            |
| Vicky Donor                                                            | 1                            |
| Vivi o, preferibilmente, morti                                         | 1                            |
| White Cargo                                                            | 1                            |
| With Byrd at the South Pole                                            | 1                            |
| (en blanco)                                                            |                              |
| **Total general**                                                      | 95                           |

![image](https://github.com/user-attachments/assets/02752247-81b4-4028-9410-8169ba96fbd4)
![image](https://github.com/user-attachments/assets/f1f51322-3463-46ec-b001-689b06f789e9)
![image](https://github.com/user-attachments/assets/9c88289a-707f-47f4-9c36-46a4c10d62d1)

## Limpieza
Proceso de limpieza de datos, tratamiento de valores nulos, duplicados y conversión de tipos de datos.

## Trabajo con Base de Datos
Explicación sobre cómo almacenar, consultar y manipular los datos dentro de una base de datos.
