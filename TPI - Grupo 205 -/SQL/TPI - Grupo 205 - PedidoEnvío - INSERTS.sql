use tp_integrador;

-- Insertar pedidos
INSERT INTO pedido (eliminado, numero, fecha, cliente_nombre, total, estado)
VALUES
(FALSE, 'PED001', '2025-11-01', 'Encarnación Ezcurra', 15000.00, 'NUEVO'),
(FALSE, 'PED002', '2025-11-02', 'Juan Manuel de Rosas', 23000.50, 'FACTURADO'),
(FALSE, 'PED003', '2025-11-03', 'Carlos Moreno', 8700.75, 'ENVIADO');

-- Insertar envíos asociados
INSERT INTO envio (eliminado, tracking, empresa, tipo, costo, fecha_despacho, fecha_estimada, estado, pedido_id)
VALUES
(FALSE, 'TRK001', 'ANDREANI', 'ESTANDAR', 500.00, '2025-11-02', '2025-11-05', 'EN_PREPARACION', 1),
(FALSE, 'TRK002', 'OCA', 'EXPRES', 750.00, '2025-11-03', '2025-11-04', 'EN_TRANSITO', 2),
(FALSE, 'TRK003', 'CORREO_ARG', 'ESTANDAR', 600.00, '2025-11-04', '2025-11-07', 'ENTREGADO', 3);