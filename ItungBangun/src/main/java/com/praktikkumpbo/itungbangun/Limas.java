/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.itungbangun;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class Limas extends Persegi{
    private SgtSamaSisi Sgt;
    private Persegi Psg;
    
    public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){
        super(Sx1, Sy1, Sx2, Sy2);
        Sgt = new SgtSamaSisi (Sx1, Sy1, Sx2, Sy2);
        Psg = new Persegi (Px1, Py1, Px2, Py2);
    }
    public double hitungLuas(){
        double luasSegitiga = Sgt.hitungLuas();
        double luasPersegi = Psg.hitungLuas();
        double Luas =  ( 4 * luasSegitiga ) + luasPersegi;
        return Luas;
    }
    public void tampil(){
        Sgt.tampil();
        Psg.tampil();
        System.out.println("Luas Limas : " + hitungLuas());
    }
}
