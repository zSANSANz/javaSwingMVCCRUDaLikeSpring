/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import testcrud.dao.PegawaiDAO;
import testcrud.koneksi.Jdbc;
import testcrud.model.Pegawai;

/**
 *
 * @author cvgs
 */
public class PegawaiDAOImpl implements PegawaiDAO {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public PegawaiDAOImpl() {
        connection = Jdbc.getConnection();
    }

    @Override
    public void save(Pegawai pegawai) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO tb_pegawai VALUES('" + pegawai.getKodePegawai() + "','" + pegawai.getNamaPegawai() + "')");
    }

    @Override
    public void update(Pegawai pegawai) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate("UPDATE tb_pegawai SET nama_pegawai='" + pegawai.getNamaPegawai()+ "' WHERE kode_pegawai='" + pegawai.getKodePegawai()+ "'");
    }

    @Override
    public void delete(Pegawai pegawai) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM tb_pegawai WHERE kode_pegawai='" + pegawai.getKodePegawai()+ "'");
    }

    @Override
    public List<Pegawai> getAllPegawai() throws SQLException {

        List<Pegawai> list = new ArrayList<Pegawai>();

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM tb_pegawai");

        while (resultSet.next()) {
            Pegawai pegawai = new Pegawai();
            pegawai.setKodePegawai(resultSet.getString("kode_pegawai"));
            pegawai.setNamaPegawai(resultSet.getString("nama_pegawai"));
            
            list.add(pegawai);
        }

        return list;
    }

}
