/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testcrud.model.Pegawai;
import testcrud.service.PegawaiService;
import testcrud.service.impl.PegawaiServiceImpl;
import testcrud.view.PegawaiForm;

/**
 *
 * @author cvgs
 */
public class PegawaiController {

    private final Pegawai pegawai = new Pegawai();
    private final PegawaiService pegawaiService = new PegawaiServiceImpl();
    
    public void addPegawai(PegawaiForm pegawaiForm) {
        String kodePegawai = pegawaiForm.getTxtKodePegawai().getText();
        String namaPegawai = pegawaiForm.getTxtNamaPegawai().getText();
        try {
            pegawai.setKodePegawai(kodePegawai);
            pegawai.setNamaPegawai(namaPegawai);

            pegawaiService.save(pegawai);
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editPegawai(PegawaiForm pegawaiForm) {
        String kodePegawai = pegawaiForm.getTxtKodePegawai().getText();
        String namaPegawai = pegawaiForm.getTxtNamaPegawai().getText();
        try {
            pegawai.setKodePegawai(kodePegawai);
            pegawai.setNamaPegawai(namaPegawai);

            pegawaiService.update(pegawai);
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletePegawai(PegawaiForm pegawaiForm) {
        String kodePegawai = pegawaiForm.getTxtKodePegawai().getText();
        try {
            pegawai.setKodePegawai(kodePegawai);

            pegawaiService.delete(pegawai);
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
}
