<h1 align="center"> 🎓 Challenge ForoHub 🎓 </h1>

## 🌟 Funcionalidades del proyecto

ForoHub es una API REST construida con el framework Spring, pensada para administrar un foro de discusión. Permite a los usuarios realizar operaciones de creación, lectura, modificación y eliminación de tópicos (CRUD). La arquitectura sigue los principios recomendados del modelo REST, incorporando validaciones, mecanismos de autenticación y autorización, además de utilizar una base de datos relacional para almacenar la información de forma persistente.

## :hammer:Requisitos

- JDK 11 o superior
- Maven
- MySQL (para entorno de producción)
- Insomnia

## 📁 Acceso al proyecto

1. Descargas los archivos necesarios o clona el repositorio
2. Configura la base de datos MySQL. Crea una base de datos y actualiza las credenciales en el archivo application.properties:

* spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
* spring.datasource.username=tu_usuario
* spring.datasource.password=tu_contraseña

3. Construir y ejecutar la aplicación:
* mvn clean install
* mvn spring-boot:run

## 🛠️ Abre y ejecuta el proyecto

✅ Una vez que la aplicación esté en funcionamiento, puedes acceder a la API REST utilizando herramientas como Postman o cURL. La URL base será http://localhost:8080.


✅ Validaciones
- Todos los campos son obligatorios al crear o actualizar un tópico.
- Los mensajes de error se devuelven en caso de fallos en las validaciones.
