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
public class Persegi extends BangunDatar {
    public void luas(){
    System.out.println("===== LUAS PERSEGI =====");
    System.out.print ("Masukkan sisi : ");
    sisi = input.nextFloat();
        luas = sisi*sisi;
        System.out.println("Luas = "+luas);
        System.out.println("");
    }
    public void keliling(){
    System.out.println("===== Keliling PERSEGI =====");
    System.out.print ("Masukkan sisi : ");
    sisi = input.nextFloat();
        keliling = 4*sisi;
        System.out.println("Keliling = "+keliling);
        System.out.println("");
    }
    
}
