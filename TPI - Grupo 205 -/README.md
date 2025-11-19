# TP Integrador – Pedido → Envío

##  Descripción del dominio
Este proyecto corresponde al Trabajo Práctico Integrador de la Tecnicatura en Programación. El sistema implementa la gestión del flujo **Pedido → Envío**, permitiendo:
- Registrar pedidos con datos del cliente, fecha, total y estado.
- Asociar cada pedido a un envío con información de empresa, tipo, costo y fechas.
- Controlar el ciclo completo: **Nuevo → Facturado → Enviado** y **En preparación → En tránsito → Entregado**.

---

##  Requisitos
- **Java:** 8
- **Gestor de BD:** MySQL (probado en versión 8.x)
- **Driver JDBC:** `mysql-connector-java`
- **Archivo SQL:** `TPI - Grupo 205 - PedidoEnvío.sql`

---

##  Pasos para crear la base de datos
1. Abrir **MySQL** o **phpMyAdmin**.
2. Ejecutar el script incluido:
   ```sql
   CREATE DATABASE IF NOT EXISTS tp_integrador;
   USE tp_integrador;

   -- Tablas Pedido y Envio
   CREATE TABLE pedido (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       eliminado BOOLEAN DEFAULT FALSE,
       numero VARCHAR(20) NOT NULL UNIQUE,
       fecha DATE NOT NULL,
       cliente_nombre VARCHAR(120) NOT NULL,
       total DECIMAL(12,2) NOT NULL,
       estado ENUM('NUEVO', 'FACTURADO', 'ENVIADO') NOT NULL
   );

   CREATE TABLE envio (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       eliminado BOOLEAN DEFAULT FALSE,
       tracking VARCHAR(40) NOT NULL UNIQUE,
       empresa ENUM('ANDREANI', 'OCA', 'CORREO_ARG') NOT NULL,
       tipo ENUM('ESTANDAR', 'EXPRES') NOT NULL,
       costo DECIMAL(10,2) NOT NULL,
       fecha_despacho DATE,
       fecha_estimada DATE,
       estado ENUM('EN_PREPARACION', 'EN_TRANSITO', 'ENTREGADO'),
       pedido_id BIGINT UNIQUE,
       FOREIGN KEY (pedido_id) REFERENCES pedido(id) ON DELETE CASCADE
   );
   ```

---

##  Cómo compilar y ejecutar
1. **Configurar conexión en `DatabaseConnection.java`:**
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/tp_integrador";
   private static final String USER = "root";
   private static final String PASSWORD = "Riverplate90";
   ```
2. **Compilar y ejecutar:**
   - Desde IDE (NetBeans/Eclipse): Ejecutar la clase `AppMenu.java`.
   - Desde consola:
     ```bash
     javac -cp .;mysql-connector-java.jar main/AppMenu.java
     java -cp .;mysql-connector-java.jar main.AppMenu
     ```
3. **Credenciales de prueba:**
   - Usuario BD: `root`
   - Contraseña BD: `Riverplate90`

4. **Flujo básico:**
   - Ejecutar `AppMenu`.
   - Seleccionar la opción deseada:
     - Alta Pedido
     - Alta Envío
     - Consultar estado
     - Salir

---

##  Video demostrativo
[Ver en YouTube](https://www.youtube.com/watch?v=BXJkoDh0qvI)

---

Grupo 205:

Reynoso Franco.
Ríos Jonathan.
Rodríguez Santiago.
Rojas Maximiliano.
