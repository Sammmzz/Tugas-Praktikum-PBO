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
public class PenjumlahanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah bilangan : ");
        int n = input.nextInt();
        
        int[] bilangan = new int[n];
        System.out.println("Masukan bilangan sebanyak : " + n);
        
        for(int i = 0; i < n; i++){
            System.out.print("Masukan bilangan ke - " + (i+1) + " : ");
            bilangan[i] = input.nextInt();
            
        }
        
        int total = 0;
        
        for(int i = 0; i < n; i++){
            total += bilangan[i];
        }
        
        float rataRata = total / n;
        
        System.out.println("Total Jumlah Bilangan : " + total);
        System.out.println("Rata Rata Bilangan : " + rataRata);
        
        
        
    }
}
