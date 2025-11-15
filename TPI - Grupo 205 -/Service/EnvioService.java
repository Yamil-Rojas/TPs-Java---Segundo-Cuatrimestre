/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import config.DatabaseConnection;
import dao.EnvioDao;
import entities.Envio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class EnvioService implements GenericService<Envio> {

    private final EnvioDao envioDao;

    public EnvioService() {
        this.envioDao = new EnvioDao();
    }

    @Override
    public void insertar(Envio envio) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            envioDao.crear(envio, conn);
        }
    }

    @Override
    public void actualizar(Envio envio) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            envioDao.actualizar(envio, conn);
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            envioDao.eliminar(id, conn);
        }
    }

    @Override
    public Optional<Envio> getById(Long id) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            return envioDao.leerPorId(id, conn);
        }
    }

    @Override
    public List<Envio> getAll() throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            return envioDao.leerTodos(conn);
        }
    }
}