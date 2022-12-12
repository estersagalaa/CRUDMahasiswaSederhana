/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.companyemployee;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class ProjectPlanner extends Employee{
    
    private long totalHasilProyek, pajak;

    public ProjectPlanner(long totalHasilProyek, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.totalHasilProyek = totalHasilProyek;
    }
    
    public long getTotalHasilProyek() {
        return totalHasilProyek;
    }
    
    public long pajak() {
        return pajak = gajiPokok * 5/100;
    }
    
    @Override
    public long gaji() {
        return gaji = gajiPokok + (komisi * totalHasilProyek) - pajak();
    }
    
    public void cetakPP() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Hasil Proyek: " + totalHasilProyek);
        System.out.println("Gaji: " + gaji());
    }
}
