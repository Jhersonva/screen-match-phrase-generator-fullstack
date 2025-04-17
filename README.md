# 🌟 Screen-Match : Phrase-Generator

## 📖 Descripción

**Screen-Match Phrase Generator** es una aplicación full-stack que permite a los usuarios visualizar los datos proporcionados por películas y series. Esta aplicación está construida con un backend robusto utilizando **Java**, **Spring Boot**, **JPA**, y **PostgreSQL**, mientras que el frontend está desarrollado con **HTML**, **CSS**, y **JavaScript** para una experiencia de usuario interactiva.

## 🛠️ Tecnologías Utilizadas

### Backend

- **Java**: Lenguaje de programación para la lógica del backend.
- **Spring Boot**: Framework para simplificar el desarrollo de aplicaciones Java.
- **JPA (Java Persistence API)**: Para la gestión de persistencia de datos.
- **PostgreSQL**: Base de datos relacional utilizada para almacenar información de las frases y usuarios.

### Frontend

- **HTML**: Para la estructura de las páginas web.
- **CSS**: Para estilos y diseño de la interfaz de usuario.
- **JavaScript**: Para interactividad en el frontend y consumo de api del backend.

## ✨ Características

- ✅ Visualización de frases de segun la pelicula y serie.
- ✅ Interfaz de usuario intuitiva y fácil de usar.
- ✅ Integración con base de datos PostgreSQL para la persistencia de datos.
- ✅ API RESTful para la comunicación entre el frontend y el backend.

## 📋 Requisitos Previos

Antes de instalar y ejecutar este proyecto, asegúrate de tener instalado:

- [JDK 11 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Node.js](https://nodejs.org/) y npm
- [PostgreSQL](https://www.postgresql.org/download/)
- Un IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) para el backend y [Visual Studio Code](https://code.visualstudio.com/) para el frontend

## 🚀 Instalación

1. **Clona el repositorio desde GitHub:**

    ```bash
    git clone https://github.com/Jhersonva/screen-match-phrase-generator.git
    ```

2. **Configura la base de datos PostgreSQL para el backend:**

    Navega al directorio del backend y crea una base de datos en PostgreSQL.

    ```bash
    cd screen-match-phrase-generator/screenmatch-frases-backend
    ```

3. **Actualiza las credenciales de acceso en `application.properties`.**

4. **Construye el backend usando Maven:**

    ```bash
    mvn clean install
    ```

5. **Inicia el backend desde tu IDE o utilizando Maven:**

    ```bash
    mvn spring-boot:run
    ```

6. **Para el frontend:**

    Navega al directorio del frontend y abre el archivo `index.html` en un navegador o utiliza una extensión de servidor en vivo desde Visual Studio Code para ejecutar el proyecto.

## 🏃 Ejecución

1. Inicia el backend desde tu IDE o con el siguiente comando:

    ```bash
    mvn spring-boot:run
    ```

2. Abre el archivo `index.html` del frontend en tu navegador para comenzar a usar la aplicación.


## 📝 Uso

1. Accede a la interfaz de usuario a través del archivo `index.html`.
2. Los datos de las series como, titulo, frase, personale y poster, estan registrados en la base de datos PostgreSQL.
3. Utiliza el boton proporcionado para visualizar los datos, segun la pelicula o serie que se mostraran aleatoriamente.

## 📜 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más información.

## 📞 Contacto

- [LinkedIn](https://www.linkedin.com/in/jhersonvillaarcibia/)
- [WhatsApp](https://wa.me/926461654)
- Gmail: jherson2408va@gmail.com

