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
public class Trapesium extends BangunDatar {
    public void luas(){
    System.out.println("===== LUAS Trapesium =====");
        System.out.print("Masukan Sisi Atas    = ");
        sisiatas = input.nextFloat();
        System.out.print("Masukan Sisi Bawah    = ");
        sisibawah = input.nextFloat();
        System.out.print("Masukan Tingggi = ");
        tinggi = input.nextFloat();
        luas = (1/2)*(sisiatas + sisibawah)*tinggi;
        System.out.println("Luas    = "+luas);
        System.out.println("");
    }
    public void keliling(){
    System.out.println("===== LUAS Trapesium =====");
        System.out.print("Masukan Sisi Atas    = ");
        sisiatas = input.nextFloat();
        System.out.print("Masukan Sisi Bawah    = ");
        sisibawah = input.nextFloat();
        System.out.print("Masukan Sisi Kanan = ");
        sisikanan = input.nextFloat();
        System.out.print("Masukan Sisi Kiri = ");
        sisikiri = input.nextFloat();
        keliling = sisiatas + sisibawah + sisikanan + sisikiri;
        System.out.println("Keliling    = "+keliling);
        System.out.println("");
    }
}
