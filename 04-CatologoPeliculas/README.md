### CatalogoPeliculas
Aplicación de consola en Java para gestionar un catálogo de películas favoritas, con la capacidad de agregar, listar y buscar películas. La aplicación también permite almacenar la información en disco, creando archivos para persistencia.

#### Arquitectura
Modelo-Vista-Controlador (MVC), también conocida como una variante de Modelo-Vista-Controlador (MVC). La aplicación organiza el código en tres capas principales para separar responsabilidades y facilitar el mantenimiento.

- dominio/: Define el modelo de datos, representado por la clase Pelicula.
- servicio/: Contiene la lógica de negocio mediante la interfaz IServicioPeliculas y sus implementaciones ServicioPeliculasArchivo y ServicioPeliculasLista.
- presentacion/: Maneja la interacción con el usuario y el flujo de la aplicación en CatalogoPeliculasApp.

#### Temas
- Paquetes y estructura modular: Organización en paquetes (dominio, presentacion, servicio) para separar la lógica, presentación y modelo.
- Creación y diseño de clases: Pelicula como clase de modelo y IServicioPeliculas como interfaz de servicio.
- Implementación de interfaces: IServicioPeliculas define métodos implementados en ServicioPeliculasArchivo (persistencia en archivos) y ServicioPeliculasLista (almacenamiento en memoria).
- Sobrecarga de constructores y encapsulación: Pelicula permite instancias con o sin nombre; sus atributos son accesibles solo mediante getters y setters.
- Sobrescritura de métodos: toString, equals, y hashCode sobrescritos en Pelicula para facilitar comparaciones y búsquedas.
- Manejo de archivos: ServicioPeliculasArchivo usa java.io para crear, leer y escribir en peliculas.txt.
- Colecciones: ServicioPeliculasLista usa ArrayList para almacenar películas en memoria.
- Manejo de excepciones: Uso de bloques try-catch para gestionar errores en archivos y entrada de usuario.
- Expresiones Lambda: Utilizadas en ServicioPeliculasLista para iterar en el listado de películas.