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

class CariGenapGanjil {

    void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();
        
        menentukanGanjilGenap(angka);
    }
    
    void menentukanGanjilGenap (int angka){
        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        }else {
            System.out.println("Bilangan Ganjil");
        }
    }
}

public class GenapGanjil {
    public static void main(String[] args) {
        CariGenapGanjil bilangan = new CariGenapGanjil();
        bilangan.inputNilai();
    }
}
