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
public class Kerucut extends BangunRuang {
    public void volume(){
    System.out.println("===== VOLUME KERUCUT =====");
        
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        System.out.print("Masukan Tinggi    = ");
        tinggi = input.nextFloat();
        
        volume = (phi * jari * jari * tinggi)/3;
        System.out.println("Volume            = "+volume);
        System.out.println("");
    }
    public void permukaan(){
    System.out.println("===== LUAS PERMUKAAN =====");
        
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        System.out.print("Masukan sisi      = ");
        sisi = input.nextFloat();
        
        permukaan = (phi * jari * jari ) + (phi * jari * sisi);
        System.out.println("Luas Permukaan    = "+permukaan);
        System.out.println("");

    }
}
