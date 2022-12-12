/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.companyemployee;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public abstract class Employee {
    protected String nama, nip;
    protected long gajiPokok, komisi, gaji;

    public Employee(String nama, String nip, long gajiPokok, long komisi) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
    }
    
    public String nama() {
        return nama;
    }
    
    public String nip() {
        return nip;
    }
    
    public long gajiPokok() {
        return gajiPokok;
    }
    
    public long komisi() {
        return komisi;
    }
    
    public abstract long gaji();
}
