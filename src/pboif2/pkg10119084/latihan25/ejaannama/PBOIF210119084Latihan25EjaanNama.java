/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan25.ejaannama;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan ejaan nama
 **/

import java.util.Scanner;
public class PBOIF210119084Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = input.next();
        
        System.out.println("Ejaan untuk "  + nama +   " adalah");
        String kata[] = nama.split("|");
        for (int i=0;i<kata.length;i++){
            System.out.println("Huruf Ke-" + (i+1) + ":" + kata[i]);
            
       System.out.println("===============================================");
       System.out.println("Developed by Muhammad Idris Merdefi");
            
        }
        
    }
    
}
