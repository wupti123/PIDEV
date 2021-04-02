/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IService;

import java.sql.SQLException;
import java.util.List;


public interface IService<T> {
    public void add(T t) throws SQLException;
    public void delete(int id) throws SQLException;
    public void update(T t) throws SQLException;
    public List<T> readAll() throws SQLException;
    public T getById(int id) throws SQLException;
}
