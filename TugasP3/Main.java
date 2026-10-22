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



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // menghitung gaji bersih pegawai
        
        int gaji_pokok,tunjangan_jabatan, tunjangan_istri, tunjangan_anak, total_gaji;
        long nik;
        String nama_karyawan;
        String alamat;
        String jabatan;
        float pajak_penghasilan, gaji_bersih;
        
        System.out.print("Masukan No induk karyawan : ");
        nik = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukan Nama Karyawan : ");
        nama_karyawan = input.nextLine();
        
        System.out.print("Masukan Alamat : ");
        alamat = input.nextLine();
        
        System.out.print("Masukan Jabatan : ");
        jabatan = input.nextLine();
        
        System.out.print("Masukan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        
        System.out.print("Tunjangan Jabatan : ");
        tunjangan_jabatan = input.nextInt();
        
        System.out.print("Tunjangan Istri : ");
        tunjangan_istri = input.nextInt();
        
        System.out.print("Tunjangan Anak : ");
        tunjangan_anak = input.nextInt();
        
//        hitung total gaji
        total_gaji = gaji_pokok + tunjangan_jabatan + tunjangan_istri + tunjangan_anak;
        System.out.println("Total Gaji : " + total_gaji);

        // hitung pajak penghasilan
        pajak_penghasilan =  (gaji_pokok + tunjangan_jabatan + tunjangan_anak) * 10/100;
        System.out.println("pajak penghasilan : " + pajak_penghasilan);
        
        gaji_bersih = total_gaji - pajak_penghasilan;
        System.out.println("Gaji bersih : " + gaji_bersih);
    }
}
