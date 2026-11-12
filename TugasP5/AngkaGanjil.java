/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */
public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak angka : ");
        int n = input.nextInt();
        
        int[] bilangan = new int[n];
        int j = 0;
        
        int angka = 1;
        do {
            
                if(angka % 2 == 1){
                    System.out.print(angka + " ");
                    bilangan[j] = angka;
                    j++;
                }
                
                angka ++;
            
        }while(j != n);
        
        int total = 0;
        for(int i = 0; i < n ; i++){
            total += bilangan[i];
        }
        
        System.out.println("Total Penjumlahan : " + total);
        
    }
}
