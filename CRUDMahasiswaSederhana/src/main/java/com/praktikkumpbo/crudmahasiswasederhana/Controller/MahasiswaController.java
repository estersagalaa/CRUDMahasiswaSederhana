/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.crudmahasiswasederhana.Controller;


import com.praktikkumpbo.crudmahasiswasederhana.Connection.ConnectionHelper;
import com.praktikkumpbo.crudmahasiswasederhana.interfc.MahasiswaInterface;
import com.praktikkumpbo.crudmahasiswasederhana.model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IP130-14AST A4R3
 */
public class MahasiswaController implements MahasiswaInterface {
    PreparedStatement st;
    
    @Override
    public Mahasiswa insert(Mahasiswa o) throws SQLException {
        st = ConnectionHelper.getConnection().prepareStatement("Insert into mahasiswa values(?,?,?)");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3, o.getAlamat());
        st.executeUpdate();
        return o;        
    }

    @Override
    public void update(Mahasiswa o) throws SQLException {
        st = ConnectionHelper.getConnection().prepareStatement("update mahasiswa set nama=?,alamat=? where nim=?");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3, o.getAlamat());
        st.executeUpdate(); 
    }

    @Override
    public void delete(String nim) throws SQLException {
        st = ConnectionHelper.getConnection().prepareStatement("delete from mahasiswa where nim=?");
        st.setString(1, nim);
        st.executeUpdate();
    }

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        Statement st = ConnectionHelper.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from mahasiswa");
        List<Mahasiswa>list = new ArrayList<Mahasiswa>();
        while(rs.next()){
           Mahasiswa mhs = new Mahasiswa();
           mhs.setNim(rs.getString("NIM"));
           mhs.setNama(rs.getString("Nama"));
           mhs.setAlamat(rs.getString("Alamat"));
           list.add(mhs);
        }
        return list;
    }
}