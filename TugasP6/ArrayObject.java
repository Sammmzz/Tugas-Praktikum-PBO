/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author Smsll
 */

public class ArrayObject {
    public static void main(String[] args) {

        // Menampung berbagai tipe data
        Object[] data = {
            19,
            0.2,
            'C',
            "Java",
            true
        };

        // Menampilkan semua data
        System.out.println("=== DATA OBJECT ARRAY ===");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
