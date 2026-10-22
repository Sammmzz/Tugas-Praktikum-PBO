/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasp3;
import java.io.*;

/**
 *
 * @author Smsll
 */

// TUGAS NO 1
public class InputOutputDataStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream output = new DataOutputStream(
               new FileOutputStream("pembelanjaan.dat")
        );
        
        
        output.writeUTF("Samsul Bahtiar");
        output.writeInt(100_000);
        output.writeInt(20);
        output.writeInt(200_000);
        
        
        output.close();
        
        DataInputStream input = new DataInputStream(
                new FileInputStream("pembelanjaan.dat")
        );
        
//        menangkap input
        String nama = input.readUTF();
        int totalBelanja = input.readInt();
        int diskon = input.readInt();
        int bayar = input.readInt();
        
        // proses
        float totalBayar = totalBelanja - (totalBelanja * diskon) / 100;
        float kembalian = bayar - totalBayar;
        
        // OUTPUT
        System.out.println("Nama : " + nama);
        System.out.println("Total Belanja : " + totalBelanja);
        System.out.println("Diskon (%) : " + diskon + " %");
        System.out.println("Total : " + totalBayar);
        System.out.println("Bayar : " + bayar);
        System.out.println("Kembalian : " + kembalian);
        
//        
                
        
    }
    
}