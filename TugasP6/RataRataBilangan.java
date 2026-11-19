/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.Scanner;

/**
 *
 * @author Smsll
 */
public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah bilangan
        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Deklarasi array
        double[] angka = new double[jumlah];

        double total = 0;

        // Input bilangan
        for (int i = 0; i < jumlah; i++) {

            while (true) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    angka[i] = Double.parseDouble(input.nextLine());

                    total += angka[i];

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Error! Input harus berupa angka.");
                }
            }
        }

        // Menghitung rata-rata
        double rataRata = total / jumlah;

        // Menampilkan isi array
        System.out.println("\nDaftar Bilangan:");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bilangan ke-" + (i + 1) + ": " + angka[i]);
        }

        // Menampilkan hasil
        System.out.println("\nTotal Bilangan : " + total);
        System.out.println("Rata-rata      : " + rataRata);

        input.close();
    }
}
