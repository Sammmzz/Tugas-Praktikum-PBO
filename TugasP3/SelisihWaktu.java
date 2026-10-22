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

class Selisih {
    int jam, menit, detik;
    
    
}


public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Selisih waktuPertama = new Selisih();
        System.out.println("==== Waktu pertama ====");
        System.out.print("Masukan Jam pertama : ");
        waktuPertama.jam = input.nextInt();
        
        System.out.print("Masukan Menit pertama : ");
        waktuPertama.menit = input.nextInt();
        
        System.out.print("Masukan Detik pertama : ");
        waktuPertama.detik = input.nextInt();
        
        Selisih waktuKedua = new Selisih();
        
        System.out.println("==== Waktu kedua ====");
        System.out.print("Masukan Jam Kedua : ");
        waktuKedua.jam = input.nextInt();
        
        System.out.print("Masukan Menit Kedua : ");
        waktuKedua.menit = input.nextInt();
        
        System.out.print("Masukan Detik Kedua : ");
        waktuKedua.detik = input.nextInt();
        
        
        System.out.println("Selisihnya adalah : " + (waktuKedua.jam - waktuPertama.jam + " jam " + (waktuKedua.menit - waktuPertama.menit) + " menit " + (waktuKedua.detik - waktuPertama.detik) + " detik " ));
        
        
        
    }
            
}
