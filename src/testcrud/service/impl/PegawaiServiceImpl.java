/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.service.impl;

import java.sql.SQLException;
import java.util.List;
import testcrud.dao.PegawaiDAO;
import testcrud.dao.impl.jdbc.PegawaiDAOImpl;
import testcrud.model.Pegawai;
import testcrud.service.PegawaiService;

/**
 *
 * @author cvgs
 */
public class PegawaiServiceImpl implements PegawaiService {

    private PegawaiDAO pegawaiDAO;

    public PegawaiServiceImpl() {
       pegawaiDAO = new PegawaiDAOImpl();
    }

    public PegawaiDAO getEmployeeDAO() {
        return pegawaiDAO;
    }

    public void setEmployeeDAO(PegawaiDAO pegawaiDAO) {
        this.pegawaiDAO = pegawaiDAO;
    }

    @Override
    public void save(Pegawai pegawai) throws SQLException {
        pegawaiDAO.save(pegawai);
    }

    @Override
    public void update(Pegawai pegawai) throws SQLException {
        pegawaiDAO.update(pegawai);
    }

    @Override
    public void delete(Pegawai pegawai) throws SQLException {
       pegawaiDAO.delete(pegawai);
    }

    @Override
    public List<Pegawai> getAllPegawai() throws SQLException {
        return pegawaiDAO.getAllPegawai();
    }
    
}
