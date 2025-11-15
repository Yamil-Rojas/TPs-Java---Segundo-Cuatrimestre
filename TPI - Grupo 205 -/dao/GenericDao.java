/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {
    void crear(T entidad, Connection conn) throws SQLException;
    Optional<T> leerPorId(Long id, Connection conn) throws SQLException;
    List<T> leerTodos(Connection conn) throws SQLException;
    void actualizar(T entidad, Connection conn) throws SQLException;
    void eliminar(Long id, Connection conn) throws SQLException;
}

//Define los métodos CRUD básicos. 
//crear, actualizar y eliminar aceptan una Connection externa para poder participar en transacciones.
//leerPorId y leerTodos pueden usar su propia conexión porque son consultas simples.