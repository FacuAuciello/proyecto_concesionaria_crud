# Concesionaria Java – CRUD con Maven y JPA

Proyecto desarrollado en Java que implementa una Interfaz Gráfica de Usuario (IGU) para la gestión de vehiculos en una concesionaria.

El objetivo principal del proyecto es **comprender como se estructura una aplicación completa en capas**, conectando la interfaz gráfica con la logica de negocio, la persistencia y la base de datos.

---

Se requiere una aplicacion que permita:

- Dar de alta nuevos automoviles.
- Consultar los automoviles registrados.
- Editar datos de un automovil existente.
- Eliminar automoviles.
- Mostrar mensajes informativos al usuario segun la accion realizada.

---

Datos gestionados del automóvil:
- Marca
- Modelo
- Kilometraje
- Motor
- Color
- Patente
- Cantidad de puertas

---

Funcionalidades:
- Interfaz grafica desarrollada con Java Swing.
- Operaciones CRUD completas (Alta, Baja, Modificacion y Consulta).
- Comunicacion entre capas:
  - IGU
  - Logica
  - Persistencia
- Uso de controladoras para desacoplar responsabilidades.
- Mensajes de confirmacion y error en la interfaz.
- Generacion automatica de tablas mediante JPA.

---

Tecnologias utilizadas:
- Java
- Maven
- Java Swing
- JPA (EclipseLink)
- MySQL
- Git & GitHub

---

Cómo ejecutar el proyecto:
1) Clonar el repositorio.
2) Abrir el proyecto en NetBeans.
3) Verificar la configuración del archivo `persistence.xml`.
4) Crear la base de datos correspondiente en MySQL.
5) Ejecutar la clase principal de la aplicación.

---

Próximas mejoras (ideas a futuro):
- Validaciones mas avanzadas en la carga de datos.
- Mejora visual de la interfaz.
- Migracion a una aplicación web.
- Implementacion de un sistema de turnos o ventas.
- Uso de Spring Boot para backend.

