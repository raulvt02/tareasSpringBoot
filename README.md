# Proyecto RA3 – Gestión de Jugadores de Videojuegos

## 1) Datos del proyecto
- Proyecto de gestión de jugadores de videojuegos. Permite listar jugadores, ver detalles de estadísticas, crear, editar y eliminar jugadores según rol. Seguridad con Spring Security: roles INVITADO, USUARIO y ADMIN.

## 2) Repositorio (fork) y gestión de versiones
- Repositorio base: https://github.com/profeInformatica101/tareasSpringBoot
- Enlace a MI fork: https://github.com/raulvt02/tareasSpringBoot
- Nº de commits realizados: 22

## 3) Arquitectura
Explica brevemente cómo has organizado:
- Controller: com.example.ra3.controlador
- SecurityConfig: com.example.ra3.config
- Service: com.example.ra3.servicio
- Repository: com.example.ra3.repositorio
- Entity: com.example.ra3.entidad
- Templates: src/main/resources/templates

## 4) Base de datos elegida (marca una)
- [x] H2
- [ ] MySQL
- [ ] PostgreSQL

## 5) Configuración de la base de datos

### application.properties / application.yml

server.port=9091
spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=create-drop
spring.main.allow-bean-definition-overriding=true

## 6) Cómo ejecutar el proyecto

Requisitos: Java 17+, Maven 3+, no requiere base de datos externa (se usa h2).
Comando de arranque: ./mvnw spring-boot:run
URL de acceso: 
- Página principal: http://localhost:9091/jugadores
- Consola H2: http://localhost:9091/h2
- Login: http://localhost:9091/login
- Pruebas
- Paginación
