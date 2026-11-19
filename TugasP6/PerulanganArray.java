/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author Smsll
 */

public class PerulanganArray {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        // Perulangan FOR biasa
        System.out.println("=== Menggunakan FOR ===");

        for (int i = 0; i < age.length; i++) {
            System.out.println("Index " + i + " : " + age[i]);
        }

        // Perulangan FOR EACH
        System.out.println("\n=== Menggunakan FOR EACH ===");

        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}

