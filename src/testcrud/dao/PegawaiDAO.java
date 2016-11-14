/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.dao;

import java.sql.SQLException;
import java.util.List;
import testcrud.model.Pegawai;

/**
 *
 * @author cvgs
 */
public interface PegawaiDAO {
    public void save(Pegawai pegawai)throws SQLException;
    public void update(Pegawai pegawai)throws SQLException;
    public void delete(Pegawai pegawai)throws SQLException;
    public List<Pegawai> getAllPegawai()throws SQLException;
}
