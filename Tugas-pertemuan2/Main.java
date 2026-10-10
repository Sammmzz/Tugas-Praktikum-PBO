/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author Smsll
 */

class PersegiPanjang{
    int panjang = 50;
    int lebar = 45;
    
    
    
    void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }
    
}

class PersamaanKuadrat{
    int a = 2; 
    int b = 10; 
    int c = 5; 
    
    
    void hitung(){
        int rumus = (b*b) - (4 * a * c);
        
        System.out.println("hasilnya : "+rumus);
    }
}

class OperasiMatematika{
    double x = 22;
    double y = 33;
    double hasil;
    
    void penjumlahan(){
        hasil = x + y;
        System.out.println("Hasil Penjumlahan : " + hasil);
    }
    
    void pengurangan(){
        hasil = x - y;
        System.out.println("Hasil Pengurangan : " + hasil);
    }
    
    void perkalian(){
        hasil = x * y;
        System.out.println("Hasil Perkalian : " + hasil);
    }
    
    void pembagian(){
        hasil = x / y;
        System.out.println("Hasil Pembagian : " + hasil);
    }
    
}

class Segitiga {
    double tinggi = 6;
    double alas = 8;
    double c;
    
    void hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        System.out.println(luas);
    }
    
    void cariCDanKeliling(){
        c = (tinggi*tinggi) + (alas*alas);
        int akar = 1;
        
        while (akar * akar < c){
            akar++;
        }
        
        System.out.println("Nilai C = " + akar);
        
        double keliling = tinggi + alas + akar;
        System.out.println("Nilai Kelilinhg = " + keliling);
    }
    
}

class KonversiSuhu {
    double c = 10;
    double f = 15;
    double r = 5;
    
    void celciusFarenheit(){
        // celcius ke farenheit
        double cF = (9.0/5) * c + 32;
        System.out.println("Celsius -> Farenheit : " + cF);
        
        // farenheit celcius
        double fC = (5.0/9) * (f - 32);
        System.out.println("Farenheit -> Celsius : " + fC);
        
    }
    
    void celciusReamur(){
        // celcius Reamur
        double cR = (4.0/5) * c;
        System.out.println("Celsius -> Reamur : " + cR);
        
        // Reamur Celcius
        double rC = (5.0/4) * r;
        System.out.println("Farenheit -> Celsius : " + rC);
    }
    
    void FarenheitReamur(){
        // Farenheit Reamur
        double fR = (4.0/9) * (f - 32);
        System.out.println("Celsius -> Reamur : " + fR);
        
        // Reamur Farenheit
        double rF = (9.0/4) * r + 32;
        System.out.println("Farenheit -> Celsius : " + rF);
    }
    
}
          


public class Main {
    public static void main(String[] args){
        // Tugas no 1
        System.out.println("=====  Tugas No 1  =====");

        int no = 0;
        
        System.out.println("Urutan no - " + ++no);
        System.out.println("Urutan no - " + ++no);
        System.out.println("Urutan no - " + ++no);
        System.out.println("Urutan no - " + ++no);

        // Tugas no 2
        System.out.println(" ");
        System.out.println("=====  Tugas No 2  =====");
        PersegiPanjang luas = new PersegiPanjang();
        luas.hitungLuas();
        
        // Tugas no 3
        System.out.println(" ");
        System.out.println("=====  Tugas No 3  =====");
        PersamaanKuadrat pKuadrat = new PersamaanKuadrat();
        pKuadrat.hitung();
        
        // Tugas no 4
        System.out.println(" ");
        System.out.println("=====  Tugas No 4  =====");
        OperasiMatematika mtk = new OperasiMatematika();
        
        mtk.penjumlahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();   
        
        
        // Tugas no 5
        System.out.println(" ");
        System.out.println("=====  Tugas No 5  =====");
        Segitiga stg = new Segitiga();
        stg.hitungLuas();
        
        //tugas no 6
        System.out.println(" ");
        System.out.println("=====  Tugas No 6  =====");
        stg.cariCDanKeliling();
        
        //tugas no 7
        System.out.println(" ");
        System.out.println("=====  Tugas No 7  =====");
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        //tugas no 8
        System.out.println(" ");
        System.out.println("=====  Tugas No 8  =====");
        double jarakBulan = 384_400;
        double jarakMatahari = 152_100_000;
        double kecepatanCahaya = 300_000;
        double waktuTempuhBulan = jarakBulan / kecepatanCahaya;
        double waktuTempuhMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu kebulan : " + waktuTempuhBulan + " Detik");
        System.out.println("Waktu Kematahari : " + waktuTempuhMatahari + " Detik");
        
        // Tugas no 9
        System.out.println(" ");
        System.out.println("=====  Tugas No 9  =====");
        KonversiSuhu konversi = new KonversiSuhu();
        konversi.celciusFarenheit();
        konversi.celciusReamur();
        konversi.FarenheitReamur();

    }
    
    
}
