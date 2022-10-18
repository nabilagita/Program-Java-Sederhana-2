/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author M.S.I
 */
public class Lingkaran extends BangunDatar {
    public void luas(){
    System.out.println("===== LUAS LINGKARAN =====");
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        luas = phi*jari*jari;
        System.out.println("Luas      = "+luas);
        System.out.println("");
    }
    public void keliling(){
    System.out.println("===== Keliling LINGKARAN =====");
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        keliling = phi*2*jari;
        System.out.println("Keliling  = "+keliling);
        System.out.println("");
    }
}
