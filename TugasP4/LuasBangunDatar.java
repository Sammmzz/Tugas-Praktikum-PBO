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
public class LuasBangunDatar {
    
    static void menu(){
        System.out.println("menu : ");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang - Layang");
        System.out.println("");
        
    }
    
    static void inputan(){
        
        Scanner input = new Scanner(System.in);   
        menu();
        System.out.print("masukan Menu : ");
        
        int pilih = input.nextInt();
        
        pilihan(pilih);
        
                
    }
    
    static void pilihan(int pilih){
        Scanner input = new Scanner(System.in);
        double luas;
        
        switch(pilih){
            case 1:
                System.out.print("Masukan Sisi : ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi : " + luas);
                break;
            case 2:
                System.out.print("Masukan Alas : ");
                double alas = input.nextDouble();
                
                System.out.print("Masukan Tinggi : ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                
                System.out.println("Luas Segitia : " + luas);
                break;
            case 3:
                System.out.print("Masukan jari jari : ");
                double r = input.nextDouble();
                
                luas = 3.14 * r * r;
                
                System.out.println("Luas Lingkaran : " + luas);
                break;
            case 4:
                System.out.print("Masukan sisi sejajar a : ");
                double a = input.nextDouble();
                
                System.out.print("Masukan sisi sejajar b : ");
                double b = input.nextDouble();
                
                System.out.print("Masukan Tinggi : ");
                double tnggi = input.nextDouble();
                
                luas = 0.5 * (a+b) * tnggi;
                
                System.out.println("Luas Trapesium : " + luas);
                break;
            case 5:
                System.out.print("Masukan panjang diagonal 1 : ");
                double diagonalSatu = input.nextDouble();
                
                System.out.print("Masukan panjang diagonal 2 : ");
                double diagonalDua = input.nextDouble();
                
                luas = 0.5 * diagonalSatu * diagonalDua;
                
                System.out.println("Luas Layang - Layang : " + luas);
                break;
                
        }
        
    }
    
    public static void main(String[] args) {
        inputan();
    }

}


