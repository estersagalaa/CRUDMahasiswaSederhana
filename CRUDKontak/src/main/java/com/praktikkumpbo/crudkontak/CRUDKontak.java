/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikkumpbo.crudkontak;

import com.praktikkumpbo.crudkontak.Frame.FrameKontak;

/**
 *
 * @author IP130-14AST A4R3
 */
public class CRUDKontak {

    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameKontak form = new FrameKontak();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
            
        });
    }
}
