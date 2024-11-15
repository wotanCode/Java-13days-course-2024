### SistemaEstudiantesSpring

Aplicación de consola que implementa un sistema CRUD, permitiendo la interacción con una base de datos SQL. La aplicación ofrece funcionalidades para crear, leer, actualizar y eliminar registros, facilitando la gestión de datos de manera eficiente desde la línea de comandos. Todo ello bajo Spring Boot.

#### Instrucciones:

Este proyecto fue creado utilizando la tecnología Maven y Spring Boot, por lo que al conectarse a una base de datos. Unicamente para g¿hacer que funcione, requiere de instalar los paquetes necesarios.

Adicionalmente, se necesita una base de datos que debe llevar por nombre `estudiantes_db`, con una tabla llamada `estudiantes`. La tabla `estudiantes` debe incluir los siguientes campos: `id_estudiante`, `nombre`, `apellido`, `telefono` y `email`.

#### Temas:

- Spring Boot: Framework de Java que simplifica la creación de aplicaciones empresariales, ofreciendo una configuración automatizada y herramientas preintegradas.

- Arquitectura en capas en Spring Boot:
  La aplicación implementa una arquitectura organizada en tres capas principales:
  1- Modelo: Representa las entidades del sistema, en este caso los estudiantes, y está vinculada a la base de datos a través de anotaciones como @Entity.
  2- Repositorio: Define las operaciones CRUD que interactúan directamente con la base de datos, utilizando Spring Data JPA.
  3- Servicio: Contiene la lógica de negocio de la aplicación, conectando la capa de repositorio con la capa de presentación.

- CRUD en bases de datos con Spring Boot: Implementación de las operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) utilizando JpaRepository para simplificar el acceso a datos.
