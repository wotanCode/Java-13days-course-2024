### SistemaEstudiantes

Aplicación de consola que implementa un sistema CRUD, permitiendo la interacción con una base de datos SQL. La aplicación ofrece funcionalidades para crear, leer, actualizar y eliminar registros, facilitando la gestión de datos de manera eficiente desde la línea de comandos.

#### Instrucciones:

Este proyecto fue creado utilizando la tecnología Maven, por lo que al conectarse a una base de datos, requiere un conector; en este caso, se ha usado el conector `MySQL Connector Java` del Maven Repository. Este ya se encuentra configurado en el archivo `pom.xml`, y solo requiere activar la descarga del paquete.

Adicionalmente, se necesita una base de datos que debe llevar por nombre `estudiantes_db`, con una tabla llamada `estudiantes`. La tabla `estudiantes` debe incluir los siguientes campos: `id_estudiante`, `nombre`, `apellido`, `telefono` y `email`.

#### Temas:

- Patrón DAO: Es una forma de organizar el código que se conecta a la base de datos, para que esté separado del resto de la aplicación. Así, el código que habla con la base de datos está en un solo lugar, facilitando su mantenimiento.
- Maven: Es una herramienta que ayuda a manejar el proyecto. Con Maven, puedes agregar bibliotecas que necesitas y este las descarga y organiza automáticamente, evitando que tengas que buscar y manejar los archivos tú mismo.
- Conexión directa a bases de datos.
- CRUD a bases de datos.
