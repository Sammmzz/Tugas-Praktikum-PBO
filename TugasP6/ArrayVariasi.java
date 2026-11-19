/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

import java.util.ArrayList;

/**
 *
 * @author Smsll
 */

public class ArrayVariasi {
    public static void main(String[] args) {
        // array 1 dimensi
        int[] angkaFavorit = {2,4,8,28};
        System.out.println("Array 1 dimensi : ");
        for(int i=0; i<angkaFavorit.length; i++){
            System.out.print(angkaFavorit[i] + " ");
        }
        
        // array multidimensi
        int[][] matriks = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}
        }; 
        System.out.println("");
        System.out.println("");
        System.out.println("Array multidimensi : ");
        for(int i= 0; i < matriks.length; i++){
            for(int j=0; j < matriks.length; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        // array list
        System.out.println("Array List : ");
        ArrayList<Integer> bilangan = new ArrayList<Integer>();
        // tambah
        bilangan.add(4);
        bilangan.add(3);
        bilangan.add(2);
        bilangan.add(10);
        
        // akses data
        System.out.println("Mengambil index 0 " + bilangan.get(0));
        // edit bilangan
        bilangan.set(1, 8);
        // hapus
        bilangan.remove(2);
        // mengambil panjang array
        System.out.println("panjang array : " + bilangan.size());
        //hapus semua data
        bilangan.clear();
        
        
        
    }
}
