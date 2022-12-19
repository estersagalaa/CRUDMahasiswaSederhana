/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.itungbangun;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class Titik {
     public double x;
    public double y;
    Titik t2;
    
    public Titik(){
        
    }
    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double hitungJarak(Titik t2){
        double jarak = Math.sqrt(Math.pow(t2.x - this.x, 2) + Math.pow(t2.y - this.y, 2));
        return jarak;
    }
    public void tampil(){
        System.out.println("x : " + this.x);
        System.out.println("y : " + this.y);
    }
}
