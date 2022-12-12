/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.companyemployee;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class SalariedEmployee extends Employee {
    private long upahMingguan;

    public SalariedEmployee(long upahMingguan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.upahMingguan = upahMingguan;
    }

    public long getUpahMingguan() {
        return upahMingguan;
    }
    
    @Override
    public long gaji(){
        return gaji = upahMingguan;
    }
    
    public void cetakSE() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Upah Mingguan: " + gaji());
    }
}
