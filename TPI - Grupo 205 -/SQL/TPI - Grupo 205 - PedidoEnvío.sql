-- Creamos la base de datos para el Trabajo Final Integrador de Programación 2.
-- Grupo 
-- Apellidos y comisión.

CREATE DATABASE IF NOT EXISTS tp_integrador;
use tp_integrador;

-- Tabla Pedido (A)
CREATE TABLE pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    eliminado BOOLEAN DEFAULT FALSE,
    numero VARCHAR(20) NOT NULL UNIQUE,
    fecha DATE NOT NULL,
    cliente_nombre VARCHAR(120) NOT NULL,
    total DECIMAL(12,2) NOT NULL,
    estado ENUM('NUEVO', 'FACTURADO', 'ENVIADO') NOT NULL
);

-- Tabla Envio (B)
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