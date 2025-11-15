/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import config.DatabaseConnection;
import dao.PedidoDao;
import entities.Pedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PedidoService implements GenericService<Pedido> {

    private final PedidoDao pedidoDao;

    public PedidoService() {
        this.pedidoDao = new PedidoDao();
    }

    @Override
    public void insertar(Pedido pedido) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            pedidoDao.crear(pedido, conn);
        }
    }

    @Override
    public void actualizar(Pedido pedido) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            pedidoDao.actualizar(pedido, conn);
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            pedidoDao.eliminar(id, conn);
        }
    }

    @Override
    public Optional<Pedido> getById(Long id) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            return pedidoDao.leerPorId(id, conn);
        }
    }

    @Override
    public List<Pedido> getAll() throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            return pedidoDao.leerTodos(conn);
        }
    }

    // ✅ Método transaccional para Pedido + Envio
    public void crearPedidoConEnvio(Pedido pedido, entities.Envio envio) throws SQLException {
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            // Validaciones
            if (pedido.getNumero() == null || pedido.getNumero().isEmpty()) {
                throw new IllegalArgumentException("Número de pedido obligatorio");
            }
            if (envio.getTracking() == null || envio.getTracking().isEmpty()) {
                throw new IllegalArgumentException("Tracking obligatorio");
            }

            // Crear Envio y Pedido
            dao.EnvioDao envioDao = new dao.EnvioDao();
            envioDao.crear(envio, conn);
            pedido.setEnvio(envio);
            pedidoDao.crear(pedido, conn);

            // Asociar pedido_id en Envio
            String updateEnvioSQL = "UPDATE envio SET pedido_id = ? WHERE id = ?";
            try (var ps = conn.prepareStatement(updateEnvioSQL)) {
                ps.setLong(1, pedido.getId());
                ps.setLong(2, envio.getId());
                ps.executeUpdate();
            }

            conn.commit();
            System.out.println("Pedido y Envío creados correctamente.");
        } catch (Exception e) {
            if (conn != null) conn.rollback();
            throw new SQLException("Error en la transacción", e);
        } finally {
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }
}