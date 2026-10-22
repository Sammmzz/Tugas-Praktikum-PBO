/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasp3;
// import library untuk buffer reader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import library dari scanner
import java.util.Scanner;
/**
 *
 * @author Smsll
 */
public class BufferScanner {
    public static void main(String[] args) throws IOException  {

        System.out.println("====================");
        System.out.println("=== Input Buffer ===");
        System.out.println("====================");
        
//      Perbedaann salah satunya mulai dari library yang di importnya untuk

        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        // untuk bufferedReader juga sama cuman kita memanggil library yang berbeda
       // untuk buffered reader akan error jika tidak menggunakan throws IOException
        
        System.out.print("Masukan Nama : ");
        String nama = br.readLine();
        
        System.out.print("Masukan umur : ");
        int umur = Integer.parseInt(br.readLine());   
        
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        
        
        System.out.println("=====================");
        System.out.println("=== Input Scanner ===");
        System.out.println("=====================");
        
        Scanner input = new Scanner(System.in);
        
        // contoh untuk penggunakan input scanner ini jauh lebih simple 
        // tinggal memanggil objek dari  scannernya dan di tampung oleh suatu variable
        // lalu menyesuaikannya dengan input.next(tergantung tipe data)
        System.out.print("Masukan Nama : ");
        String name = input.nextLine();
        
        System.out.print("Masukan umur : ");
        int age = input.nextInt();
        
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        
        
    }
}