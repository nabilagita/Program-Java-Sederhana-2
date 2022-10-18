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
public class LimasPersegi extends BangunRuang {
    public void volume(){
    System.out.println("===== VOLUME LIMAS PERSEGI =====");
        System.out.print("Masukan Sisi           = ");
        sisi = input.nextFloat();
        System.out.print("Masukan Tinggi Limas   = ");
        tinggilimas = input.nextFloat();
       
        volume =  ((sisi * sisi) * tinggilimas)/3;
        System.out.println("Volume               = "+volume);        
        System.out.println("");
    }
    public void permukaan(){
    System.out.println("===== LUAS PERMUKAAN =====");
        System.out.print("Masukan Sisi           = ");
        sisi = input.nextFloat();
                
        System.out.print("Masukan rusuk Limas    = ");
        tinggilimas = input.nextFloat();
       
        permukaan =  ((sisi * sisi) + ((tinggilimas * sisi) /2) + ((tinggilimas * sisi) /2) ) ;
        System.out.println("Luas Permukaan       = "+permukaan);        
        System.out.println("");

    }
}
