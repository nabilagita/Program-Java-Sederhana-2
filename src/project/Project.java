/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author M.S.I
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih, hitung;
        
        Scanner input = new Scanner(System.in);
        
        try {
            do{
                System.out.println ("Menu : ");
                System.out.println ("1. Bangun Datar");
                System.out.println ("2. Bangun Ruang");
                System.out.println ("12. Keluar");
               System.out.print ("Pilih : ");
               pilih = input.nextInt();
               switch (pilih){
                   case 1:
                       System.out.println("1. Persegi");
                       System.out.println("2. Lingkaran");
                       System.out.println("3. Trapesium");
                       System.out.print("Pilih : ");
                       pilih = input.nextInt();
                       System.out.print("");
                       
                       if (pilih == 1){ 
                    System.out.println("1. Hitung Luas");
                    System.out.println("2. Hitung Keliling");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.print("");
                    Persegi persegi = new Persegi();
                    if (hitung == 1){
                    persegi.luas();
                    }
                    else if (hitung == 2){
                    persegi.keliling();
                    }
                }
                       else if (pilih == 2){
                    System.out.println("1. Hitung Luas");
                    System.out.println("2. Hitung Keliling");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.print("");
                    Lingkaran lingkaran = new Lingkaran();
                    if (hitung == 1){
                    lingkaran.luas();
                    }
                    else if (hitung == 2){
                    lingkaran.keliling();
                    }
                }
                       else if (pilih ==3){
                           System.out.println("1. Hitung Luas");
                    System.out.println("2. Hitung Keliling");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.print("");
                    Trapesium trapesium = new Trapesium();
                    if (hitung == 1){
                    trapesium.luas();
                    }
                    else if (hitung == 2){
                    trapesium.keliling();
                    }
                }
                       break;
                   case 2:
                System.out.println("1. Kubus");
                System.out.println("2. Limas Persegi");
                System.out.println("3. Kerucut");
                System.out.println("4. Tabung");
                System.out.println("5. Limas Trapesium");
                System.out.println("6. Prisma Trapesium");
                System.out.print ("Pilih : ");
                pilih = input.nextInt();
                System.out.print ("");
                 if (pilih == 1) {
                    System.out.println("1. Hitung Volume");
                    System.out.println("2. Hitung Luas Permukaan");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.print("");
                    Kubus kubus = new Kubus();
                    if (hitung == 1){
                    kubus.volume();
                    }
                    else if (hitung == 2){
                    kubus.permukaan();
                    }
    }
                 else if (pilih == 2) {
                    System.out.println("1. Hitung Volume");
                    System.out.println("2. Hitung Luas Permukaan");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.println("");
                    LimasPersegi limaspersegi = new LimasPersegi();
                    if (hitung == 1){
                    limaspersegi.volume();
                    }
                    else if (hitung == 2){
                    limaspersegi.permukaan();
                    }
                 }
                 else if (pilih == 3) {
                    System.out.println("1. Hitung Volume");
                    System.out.println("2. Hitung Luas Permukaan");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.println("");
                    Kerucut kerucut = new Kerucut();
                    if (hitung == 1){
                    kerucut.volume();
                    }
                    else if (hitung == 2){
                    kerucut.permukaan();
                    }
                 }
                 else if (pilih == 4) {
                    System.out.println("1. Hitung Volume");
                    System.out.println("2. Hitung Luas Permukaan");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.println("");
                    Tabung tabung = new Tabung();
                    if (hitung == 1){
                    tabung.volume();
                    }
                    else if (hitung == 2){
                    tabung.permukaan();
                    }
                 }
                 else if (pilih == 5) {
                    System.out.println("1. Hitung Volume");
                    System.out.println("2. Hitung Luas Permukaan");
                    System.out.print("Pilih : ");
                    hitung = input.nextInt();
                    System.out.println("");
                    
                    if (hitung == 1){
                        
                    }
                    else if (hitung == 2){
                        
                    }
                 }
                 break;
    
}
            } while (pilih < 12);
            } catch (Exception e) {System.out.println("Maaf anda salah input");
    }
}
}