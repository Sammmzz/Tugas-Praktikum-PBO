/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasp3;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */



public class MesinCetak {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukan Jumlah Novel : ");
        int jmlhNovel = input.nextInt();
        
        System.out.print("Masukan Jumlah lembar pernovel : ");
        int jmlhLembar = input.nextInt();
        
        int totalLembar = jmlhNovel * jmlhLembar;
        
        int menit = totalLembar / 60;
        int jam = menit / 60;
        menit -= 60*jam;
        int hari = jam / 24 ;
        jam -= 24*hari;
        
        System.out.println("Jumlah Novel yang akan di cetak : " + jmlhNovel);
        System.out.println("Jumlah lembar per novel : " + jmlhLembar);
        System.out.println("Total lembar : " + totalLembar);
        System.out.println("Waktu yang di perlukan untuk di cetak : ");
        System.out.println("Hari : " + hari);
        System.out.println("Jam : " + jam);
        System.out.println("Menit : " + menit);
        
         
    }
}
