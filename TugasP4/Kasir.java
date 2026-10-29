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



public class Kasir {
    
    static void inputan(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Total Belanja : ");
        int totalBelanja = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Apakah Anda memiliki kartu Member ? (Y/N): ");
        char member = input.nextLine().charAt(0);

        pengecekan(totalBelanja, member);

    }
    
    static void pengecekan(int totalBelanja, char member){
        int diskon = 0;
        if(member == 'Y' || member == 'y'){
            if(totalBelanja > 500_000){
                diskon = 50000;
            }else if(totalBelanja > 100_000){
                diskon = 15000;
            }
        }else {
            if(totalBelanja > 100_000){
                diskon = 10000;
            }
        }
        
        // hitung
        int totalBayar = totalBelanja - diskon;
        
        menampilkanTotalBayar(totalBayar, diskon, totalBelanja);
    }
    
    static void menampilkanTotalBayar(int totalBayar, int diskon, int totalBelanja){
        System.out.print("=====================");
        System.out.print("==== Total Bayar ====");
        System.out.print("=====================");
        
        System.out.println("Total Belanja : " + totalBelanja);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Yang Harus di bayar : " + totalBayar );
        
        System.out.println("====================");
        System.out.println("==== Pembayaran ====");
        System.out.println("====================");
        pembayaran(totalBayar);
    }
    
    static void pembayaran(int totalBayar){
        
        Scanner input = new Scanner(System.in);
        
        int kembalian = 0;
        System.out.print("Masukan Jumlah uang bayar : ");
        int bayar = input.nextInt();
        
        if(bayar < totalBayar){
            System.out.println("Masukan kembali uang yang sesuai dengan total bayar !!");
            pembayaran(totalBayar);
        }else if (bayar > totalBayar){
            kembalian = bayar - totalBayar;
            System.out.println("Kembalian : Rp." + kembalian );
        }else {
            System.out.println("Tidak Ada kembalian Uang pass !!");
        }
        
        
        
    }
    
    
   
    
    public static void main(String[] args) {
        inputan();
    }
}
