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


public class TahunKabisat {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan tahun : ");
    int tahun = input.nextInt();
    
       
    if(tahun % 4 == 0){
        System.out.println("Tahun Kabisat");
    }else {
        System.out.println("Bukan Tahun kabisat");
    }
    
    }
    
}
