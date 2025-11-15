/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
    void insertar(T entidad) throws SQLException;
    void actualizar(T entidad) throws SQLException;
    void eliminar(Long id) throws SQLException;
    Optional<T> getById(Long id) throws SQLException;
    List<T> getAll() throws SQLException;
}
