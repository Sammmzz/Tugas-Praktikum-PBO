/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */
public class ArrayMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        // deklarasi array
        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];
        
        // input 
        for(int i = 0; i < jumlah; i++){
            System.out.println("Mahasiswa ke - " + (i+1));
            System.out.print("\nMasukan Nama : ");
            nama[i] = input.nextLine();
            
            System.out.print("\nMasukan Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();
            
            // menentukan status kelulusan
            if(nilai[i] >= 50){
                status[i] = "Lulus";
            }else {
                status[i] = "Tidak Lulus";
            }
        }
        
        // output
        System.out.println(" ");
        System.out.println("Daftar Nilai mahasiswa");
        System.out.println("----------------------------------------");
        System.out.println("No " + " Nama " + " Nilai " + " Status");
        System.out.println("----------------------------------------");
       
        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + "   " + nama[i] + "   " + nilai[i] + "   "+ status[i]);
        }
        System.out.println("----------------------------------------");
        
    }
}
