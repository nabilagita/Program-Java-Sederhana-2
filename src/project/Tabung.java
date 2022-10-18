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
public class Tabung extends BangunRuang{
    public void volume(){
    System.out.println("===== VOLUME TABUNG =====");
        
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        System.out.print("Masukan Tinggi    = ");
        tinggi = input.nextFloat();
        volume = phi * jari * jari * tinggi;
        System.out.println("Volume            = "+volume);
        System.out.println("");
    }
    public void permukaan(){
    System.out.println("===== LUAS PERMUKAAN =====");
        
        System.out.print("Masukan Jari-Jari = ");
        jari = input.nextFloat();
        System.out.print("Masukan Tinggi    = ");
        tinggi = input.nextFloat();
        
        permukaan = 2*  phi * jari * ( jari + tinggi );
        System.out.println("Luas Permukaan     = "+permukaan);
        System.out.println("");

    }
}
