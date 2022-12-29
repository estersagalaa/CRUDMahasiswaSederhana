/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.praktikkumpbo.crudmahasiswasederhana.interfc;

import com.praktikkumpbo.crudmahasiswasederhana.model.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author IP130-14AST A4R3
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update (Mahasiswa o) throws SQLException;
    void delete (String nim) throws SQLException;
    List<Mahasiswa> getAll() throws SQLException;
}
