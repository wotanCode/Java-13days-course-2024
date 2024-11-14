### SistemaEstudiantes

Aplicación de consola que implementa un sistema CRUD, permitiendo la interacción con una base de datos SQL. La aplicación ofrece funcionalidades para crear, leer, actualizar y eliminar registros, facilitando la gestión de datos de manera eficiente desde la línea de comandos.

#### Instrucciones:

Este proyecto fue creado utilizando la tecnología Maven, por lo que al conectarse a una base de datos, requiere un conector; en este caso, se ha usado el conector `MySQL Connector Java` del Maven Repository. Este ya se encuentra configurado en el archivo `pom.xml`, y solo requiere activar la descarga del paquete.

Adicionalmente, se necesita una base de datos que debe llevar por nombre `estudiantes_db`, con una tabla llamada `estudiantes`. La tabla `estudiantes` debe incluir los siguientes campos: `id_estudiante`, `nombre`, `apellido`, `telefono` y `email`.

#### Temas:

- Patrón DAO.
- Maven.
- Conexión directa a bases de datos.
- CRUD a base de datos.
