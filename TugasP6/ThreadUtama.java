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


class AnakThread extends Thread {

    public AnakThread(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        System.out.println(
            getName() + " sedang berjalan..."
        );
    }
}

public class ThreadUtama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MULTI THREAD ===");

        System.out.println("Thread utama: " +
                Thread.currentThread().getName());

        System.out.print("Masukkan jumlah thread anak: ");
        int jumlah = input.nextInt();

        // Membuat thread anak sebanyak input pengguna
        for (int i = 1; i <= jumlah; i++) {

            AnakThread thread = new AnakThread("Thread Anak " + i);

            thread.start();
        }

        System.out.println("Thread utama selesai menjalankan perintah.");

        input.close();
    }
}
