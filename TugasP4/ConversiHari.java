/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */




public class ConversiHari {
    
    static void menuHari(){
        System.out.println("=================");
        System.out.println("=== List Hari ===");
        System.out.println("1. senin"); 
        System.out.println("2. Selasa"); 
        System.out.println("3. Rabu"); 
        System.out.println("4. Kamis"); 
        System.out.println("5. Jumat"); 
        System.out.println("6. Sabtu"); 
        System.out.println("7. Minggu"); 
        System.out.println("=================");
        System.out.println(" ");
    }
    
    static void inputan(){
        Scanner input = new Scanner(System.in);
        menuHari();
        System.out.print("Masukan Pilihan : ");
        int pilihan = input.nextInt();
        
        pilihanToHari(pilihan);
    }
    
    
    static void pilihanToHari(int pilihan){
        switch(pilihan){
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }
    } 
    
    public static void main(String[] args) {
        inputan();
        
    }
        
}
