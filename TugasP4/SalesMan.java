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
public class SalesMan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masuk Total penjualan salesman : ");
        int penjualanSalesman = input.nextInt();
        int uangJasa = 0;
        int komisi = 0;

        if(penjualanSalesman == 2_000_000){
            uangJasa = 100_000;
            komisi = (penjualanSalesman * 10) / 100;
        }else if(penjualanSalesman >= 2_000_000 && penjualanSalesman <= 5_000_000){
            uangJasa = 200_000;
            komisi = (penjualanSalesman * 15) / 100;
        }else if(penjualanSalesman > 5_000_000){
            uangJasa = 300_000;
            komisi = (penjualanSalesman * 20) / 100;
        }
        
        System.out.println("=== Pendapatan Salesman ===");
        System.out.println("Penjualan Sales : " + penjualanSalesman);
        System.out.println("Uang Jasa : " + uangJasa);
        System.out.println("Komisi : " + komisi);
        
    }
}
