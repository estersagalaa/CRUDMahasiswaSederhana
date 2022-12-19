/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.itungbangun;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class Persegi extends Titik{
    public double sisiPSG;
    
    public Persegi(double x1, double y1, double x2, double y2){
        super.x = x1; 
        super.y = y1;
        t2 = new Titik (x2, y2);
    }
    public double hitungLuas(){
        sisiPSG = super.hitungJarak(t2);
        double Luas = sisiPSG * sisiPSG;
        return Luas;
    }
    public void tampil(){
        System.out.println("== DATA Persegi ==");
        System.out.println("Point         : [" + super.x + ", " + super.y + "]");
        System.out.println("Sisi Segitiga : " + sisiPSG);
        System.out.println("Luas Segitiga : " + hitungLuas());
        System.out.println("");
    }
}
