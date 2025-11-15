/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.Pedido;
import entities.EstadoPedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoDao implements GenericDao<Pedido> {

    private static final String INSERT_SQL = 
        "INSERT INTO pedido (numero, fecha, cliente_nombre, total, estado, eliminado) VALUES (?, ?, ?, ?, ?, false)";
    private static final String SELECT_BY_ID_SQL = 
        "SELECT * FROM pedido WHERE id = ? AND eliminado = false";
    private static final String SELECT_ALL_SQL = 
        "SELECT * FROM pedido WHERE eliminado = false";
    private static final String UPDATE_SQL = 
        "UPDATE pedido SET numero = ?, fecha = ?, cliente_nombre = ?, total = ?, estado = ? WHERE id = ?";
    private static final String DELETE_SQL = 
        "UPDATE pedido SET eliminado = true WHERE id = ?";

    @Override
    public void crear(Pedido pedido, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, pedido.getNumero());
            ps.setDate(2, Date.valueOf(pedido.getFecha()));
            ps.setString(3, pedido.getClienteNombre());
            ps.setDouble(4, pedido.getTotal());
            ps.setString(5, pedido.getEstado().name());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    pedido.setId(rs.getLong(1));
                }
            }
        }
    }

    @Override
    public Optional<Pedido> leerPorId(Long id, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(SELECT_BY_ID_SQL)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToPedido(rs));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Pedido> leerTodos(Connection conn) throws SQLException {
        List<Pedido> pedidos = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(SELECT_ALL_SQL);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                pedidos.add(mapResultSetToPedido(rs));
            }
        }
        return pedidos;
    }

    @Override
    public void actualizar(Pedido pedido, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(UPDATE_SQL)) {
            ps.setString(1, pedido.getNumero());
            ps.setDate(2, Date.valueOf(pedido.getFecha()));
            ps.setString(3, pedido.getClienteNombre());
            ps.setDouble(4, pedido.getTotal());
            ps.setString(5, pedido.getEstado().name());
            ps.setLong(6, pedido.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void eliminar(Long id, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(DELETE_SQL)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    private Pedido mapResultSetToPedido(ResultSet rs) throws SQLException {
        Pedido pedido = new Pedido();
        pedido.setId(rs.getLong("id"));
        pedido.setNumero(rs.getString("numero"));
        pedido.setFecha(rs.getDate("fecha").toLocalDate());
        pedido.setClienteNombre(rs.getString("cliente_nombre"));
        pedido.setTotal(rs.getDouble("total"));
        pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));
        pedido.setEliminado(rs.getBoolean("eliminado"));
        return pedido;
    }
}