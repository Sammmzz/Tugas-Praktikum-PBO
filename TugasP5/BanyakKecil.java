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

public class BanyakKecil {
    public static void main(String[] args) {
        int in = 0;
        
        int[] bilangan = new int[10];
        
            System.out.println("Masukan 10 Bilangan ");
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Bilangan ke - " + (in+1) + " : ");
            bilangan[in] = input.nextInt();
            in++;
        }while(in < 10);
        
        int terbesar = bilangan[0];
        int terkecil = bilangan[0];
        
        for(int i = 0; i<10; i++){
            if(bilangan[i] > terbesar){
                terbesar = bilangan[i];
            }else if (bilangan[i] < terkecil){
                terkecil = bilangan[i];
            }
        }
        
        System.out.println("Bilangan Terbesar : " + terbesar);
        System.out.println("Bilangan Terkecil : " + terkecil);
        
    }
}
