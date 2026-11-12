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
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyak garis : ");
        int baris = input.nextInt();
        
        int angka = 1;
        for(int i = 1; i<= baris; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println("");
        }
    }
}
