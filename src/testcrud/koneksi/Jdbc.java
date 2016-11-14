/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cvgs
 */
public class Jdbc {
    private static final Connection CONNECTION;
    
    static {
        try {
            CONNECTION = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_karaoke","root","");
        } catch (Throwable ex) {
            System.err.println("Initial JDBC creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Connection getConnection() {
        return CONNECTION;
    }
}
