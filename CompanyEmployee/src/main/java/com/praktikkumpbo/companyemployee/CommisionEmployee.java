/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.companyemployee;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class CommisionEmployee extends Employee{
    private long totalPenjualan;

    public CommisionEmployee(long totalPenjualan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.totalPenjualan = totalPenjualan;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }
    
    @Override
    public long gaji() {
        return gaji = (gajiPokok + (komisi * totalPenjualan));
    }
    
    public void cetakCE(){
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Penjualan: " + totalPenjualan);
        System.out.println("Komisi: " + komisi);
        System.out.println("Gaji: " + gaji());
    }
}
