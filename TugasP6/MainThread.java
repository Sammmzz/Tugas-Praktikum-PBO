/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author Smsll
 */

class MahasiswaThread extends Thread {

    // Mendefinisikan ulang method run()
    @Override
    public void run() {

        System.out.println("Thread mulai berjalan!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses ke-" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu!");
            }
        }

        System.out.println("Thread selesai dijalankan!");
    }
}

public class MainThread {
    public static void main(String[] args) {

        // Membuat objek dari kelas MahasiswaThread
        MahasiswaThread thread1 = new MahasiswaThread();

        // Memulai eksekusi thread
        thread1.start();

        System.out.println("Program utama selesai memanggil thread.");
    }
}
