/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author Smsll
 */
public class ArrayMobil {
    public static void main(String[] args) {
        String[] Mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.println("Sebelum di ubah : ");
        for(int i=0; i < Mobil.length; i++){
            System.out.print(Mobil[i] + " ");
        
        }
        
        System.out.println("");
        Mobil[1] = "Toyota";
        
        System.out.println("Sesudah di ubah : ");
        for(int i=0; i < Mobil.length; i++){
            System.out.print(Mobil[i] + " ");
        
        }
        
    }
}
