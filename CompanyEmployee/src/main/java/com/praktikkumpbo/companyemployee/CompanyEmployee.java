/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikkumpbo.companyemployee;

/**
 *
 * @author 21103106 - Ester Anastasya Sagala
 */
public class CompanyEmployee {
     public static void main(String[] args) {

    
    SalariedEmployee salaried = new SalariedEmployee(100_000, "Johnny B. Goode", "2110211", 0, 0);
        CommisionEmployee commision = new CommisionEmployee(100,"Gaunter O'dymm","2001666", 5_000_000, 25_000);
        
        ProjectPlanner project = new ProjectPlanner(4, "Ryuugoku", "2001345",  5_500_000, 30_000);
        
    System.out.println("DATA SALARIED EMPLOYEE");
        salaried.cetakSE();
                
        System.out.println("\nDATA COMMISSION EMPLOYEE");
        commision.cetakCE();
        
        System.out.println("\nDATA PROJECT PLANNER");
        project.cetakPP();
    }
}
    
     