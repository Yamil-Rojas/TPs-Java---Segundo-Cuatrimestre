/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.Envio;
import entities.EmpresaEnvio;
import entities.TipoEnvio;
import entities.EstadoEnvio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnvioDao implements GenericDao<Envio> {

    private static final String INSERT_SQL =
        "INSERT INTO envio (tracking, empresa, tipo, costo, fecha_despacho, fecha_estimada, estado, eliminado) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, false)";
    private static final String SELECT_BY_ID_SQL =
        "SELECT * FROM envio WHERE id = ? AND eliminado = false";
    private static final String SELECT_ALL_SQL =
        "SELECT * FROM envio WHERE eliminado = false";
    private static final String UPDATE_SQL =
        "UPDATE envio SET tracking = ?, empresa = ?, tipo = ?, costo = ?, fecha_despacho = ?, fecha_estimada = ?, estado = ? WHERE id = ?";
    private static final String DELETE_SQL =
        "UPDATE envio SET eliminado = true WHERE id = ?";

    @Override
    public void crear(Envio envio, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, envio.getTracking());
            ps.setString(2, envio.getEmpresa().name());
            ps.setString(3, envio.getTipo().name());
            ps.setDouble(4, envio.getCosto());
            ps.setDate(5, envio.getFechaDespacho() != null ? Date.valueOf(envio.getFechaDespacho()) : null);
            ps.setDate(6, envio.getFechaEstimada() != null ? Date.valueOf(envio.getFechaEstimada()) : null);
            ps.setString(7, envio.getEstado().name());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    envio.setId(rs.getLong(1));
                }
            }
        }
    }

    @Override
    public Optional<Envio> leerPorId(Long id, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(SELECT_BY_ID_SQL)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToEnvio(rs));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Envio> leerTodos(Connection conn) throws SQLException {
        List<Envio> envios = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(SELECT_ALL_SQL);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                envios.add(mapResultSetToEnvio(rs));
            }
        }
        return envios;
    }

    @Override
    public void actualizar(Envio envio, Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(UPDATE_SQL)) {
            ps.setString(1, envio.getTracking());
            ps.setString(2, envio.getEmpresa().name());
            ps.setString(3, envio.getTipo().name());
            ps.setDouble(4, envio.getCosto());
            ps.setDate(5, envio.getFechaDespacho() != null ? Date.valueOf(envio.getFechaDespacho()) : null);
            ps.setDate(6, envio.getFechaEstimada() != null ? Date.valueOf(envio.getFechaEstimada()) : null);
            ps.setString(7, envio.getEstado().name());
            ps.setLong(8, envio.getId());
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

    private Envio mapResultSetToEnvio(ResultSet rs) throws SQLException {
        Envio envio = new Envio();
        envio.setId(rs.getLong("id"));
        envio.setTracking(rs.getString("tracking"));
        envio.setEmpresa(EmpresaEnvio.valueOf(rs.getString("empresa")));
        envio.setTipo(TipoEnvio.valueOf(rs.getString("tipo")));
        envio.setCosto(rs.getDouble("costo"));
        envio.setFechaDespacho(rs.getDate("fecha_despacho") != null ? rs.getDate("fecha_despacho").toLocalDate() : null);
        envio.setFechaEstimada(rs.getDate("fecha_estimada") != null ? rs.getDate("fecha_estimada").toLocalDate() : null);
        envio.setEstado(EstadoEnvio.valueOf(rs.getString("estado")));
        envio.setEliminado(rs.getBoolean("eliminado"));
        return envio;
    }
}
