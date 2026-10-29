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

class Karyawan {
    String nik;
    String nama;
    char kodeGolongan;
    String status;
    int jmlhAnak;
    int gajiPokok;
    
    Karyawan (){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NIK : ");
        this.nik = input.nextLine();
        
        System.out.print("masukan Nama : ");
        this.nama = input.nextLine();

        System.out.print("masukan Status Pernikahan : ");
        this.status = input.nextLine();
        
        pengecekanGolongan(status);
        
        System.out.print("masukan Jumlah anak : ");
        this.jmlhAnak = input.nextInt();
        
    }
    
    void pengecekanGolongan(String status){
        if(status.equals("Menikah")){
            this.kodeGolongan = '1';
            this.gajiPokok = 1_200_000;
        }else if (status.equals("Belum Menikah")){
            this.kodeGolongan = '2';
            this.gajiPokok = 1_500_000;
        }else if (status.equals("Cerai")){
            this.kodeGolongan = '3';
            this.gajiPokok = 1_750_000;
        }else if (status.equals("Menikah dan punya anak")){
            this.kodeGolongan = '4';
            this.gajiPokok = 2_000_000;
        }
    }
    
    void output(){
        System.out.println("==========================");
        System.out.println("=== Slip Gaji Karyawan ===");
        System.out.println("==========================");
        System.out.println("nama : " + this.nama);
        System.out.println("NIK : " + this.nik);
        System.out.println("Status Pernikahan : " + this.status);
        System.out.println("Jumlah Anak : " + this.jmlhAnak);
        System.out.println("Kode Golongan : " + this.kodeGolongan);
        System.out.println("Gaji Pokok : " + this.gajiPokok);
        System.out.println("=== Tunjangan Gaji Karyawan ===");
        hitungTunjangan(kodeGolongan, gajiPokok, jmlhAnak);
        
        
    }
    
    void hitungTunjangan(char kodeGolongan, int gajiPokok, int jmlhAnak){
        switch(kodeGolongan){
            case '1':
                double tunjangan = 10.0/100 * gajiPokok;
                System.out.println("Tunjangan Sudah Menikah : " + tunjangan);
                break;
            case '4':
                double tunjanganAnak =( 5.0/100 * gajiPokok) * jmlhAnak;
                double tunjanganIstri = 10.0/100 * gajiPokok;
                double tunjanganAnakIstri = tunjanganAnak + tunjanganIstri;
                System.out.println("Tunjangan Anak : " + tunjanganAnak);
                System.out.println("Tunjangan Istri : " + tunjanganIstri);
                System.out.println("Total Tunjangan Sudah Menikah : " + tunjanganAnakIstri);
                break;
            default: 
                System.out.println("Tidak mendapatkan Tunjangan !");
                
        }
    }
    
}

public class PenggajianKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.output();
    }
    
}
