/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasp3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Smsll
 */
public class BerbagiBuah {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukan pcs Buah mangga : ");
        int buahMangga = Integer.parseInt(br.readLine());
        
        System.out.print("buah jambu yang di bagikan : ");
        int buahJambu = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah tetangga : ");
        int jmlhTetangga = Integer.parseInt(br.readLine());
        int totalDiberikan = buahJambu * jmlhTetangga;
        
        System.out.print("Jumlah buah mangga busuk : ");
        int jmlhBuahBusuk = Integer.parseInt(br.readLine());
        
        int sisaJambu = buahJambu - jmlhTetangga;
        int sisaMangga = buahMangga - jmlhBuahBusuk;
        
        System.out.println("Jumlah Buah mangga yang di beli: " + buahMangga);
        System.out.println("Jumlah Buah jambu yang di beli : " + buahJambu);
        System.out.println("jumlah di bagikan ke tetangga : " + jmlhTetangga);
        System.out.println("jumlah di bagikan ke tetangga : " + totalDiberikan);
        System.out.println("jumlah buah busuk : " + jmlhBuahBusuk);
        System.out.println("Sisa jambu : " + sisaJambu);
        System.out.println("Sisa mangg : " + sisaMangga);
    }
}
