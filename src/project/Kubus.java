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
public class Kubus extends BangunRuang {
    public void volume(){
        System.out.println("===== VOLUME KUBUS =====");
        System.out.print("Masukan Sisi = ");
        sisi = input.nextFloat();
        volume = sisi*sisi*sisi;
        System.out.println("Volume       = "+volume);
        System.out.println("");
        System.out.println("masukkan sisi depan : ");
    
    }
    public void permukaan(){
    System.out.println("===== LUAS PERMUKAAN =====");
   
        System.out.print("Masukan Sisi    = ");
        sisi = input.nextFloat();
 
        permukaan = 6 * sisi*sisi;
        System.out.println("Luas Permukaan = "+permukaan);
        System.out.println("");

    }
    
    
}
