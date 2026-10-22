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
public class Sentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai M : ");
        int m = input.nextInt();
        
        System.out.print("Masukan Nilai V : ");
        int v = input.nextInt();
        
        System.out.print("Masukan Nilai r : ");
        int r = input.nextInt();
        
        int f = (m * (v*v)) /r; 
        
        System.out.println("Hasilnya : " + f);
        
    }
}
