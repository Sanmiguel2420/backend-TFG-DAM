# Backend TFG DAM

Backend desarrollado con Spring Boot y bases de datos locales en H2Database para el proyecto TFG DAM.

  ## Tecnologías utilizadas

	- Java 21
	- Spring Boot 4.0.2
	- Spring Data JPA
	- Spring Web MVC
	- H2 Database
	- Swagger / OpenAPI
	- Lombok
	- Maven


# Requisitos técnicos

## Software necesario

Versiónes necesarias

	- Java JDK 21
	- Maven 3.9+

# Dependencias del proyecto

	- JPA/Hibernate 4.0.2
	- Spring Boot Starter Web 4.0.2
	- Spring Boot DevTools 4.0.2
	- Lombok 1.18.42
	- Swagger 2.1.0
	- H2 2.4.240
# Manual de instalación y ejecución
	- Descargar las Bases de datos H2Database desde ( https://www.h2database.com/html/main.html )
	- Clonar el repositorio en un IDE, en mi caso Intellij IDEA 2025.3.4
	- Ejecutar el archivo src/main/java/TFGDAM/backend/BackendApplication.java pulsando el boton superior de ejecutar o con Mayús + F10
	- En el caso de querer acceder desde Swagger (Cosa que recomiendo) se debe acceder a ( http://localhost:8080/swagger-ui/index.html#/ ) una vez la aplicacion haya sido ejecutada.
	- En este momento, la API tiene dos Endpoints llamados "/Tfgdam/Usuario/cargar" y "/TfgDam/Libro/cargar", se deben de ejecutar estos dos EndPoints primero, indistintamente del orden en el que se ejecuten, para agregar información para realizar pruebas(Tambien se puede agregar distintos mediante los EndPoints "/Tfgdam/Usuario/insertar" y "/TfgDam/Libro/insertar")
	- Agregar un prestamo, mediante el EndPoint "/Tfgdam/Prestamo/guardar" para agregar una relacion entre un usuario y un libro (En el caso de haber usado los dos Endpoints de cargar). Puedes insertar este prestamo simplemente copiandolo

	-{
	  "numOperacion": "01",
	  "libro": {
	    "isbn": "12345",
	    "titulo": "Palabras Radiantes",
	    "autor": "Brandon Sanderson",
	    "editorial": "Nova",
	    "categorias": [
	      "FANTASIA"
	    ],
	    "fechaSalida": "2026-05-11",
	    "tipoLibro": "TAPA_DURA"
	  },
	  "usuario": {
	    "dni": "000001M",
	    "nombre": "Juan",
	    "apellidos": "Garcia Martin",
	    "fechaNacimiento": "2008-05-12",
	    "fechaAlta": "2026-01-12"
	  },
	  "fechaPrestamo": "2026-05-12"
	}
