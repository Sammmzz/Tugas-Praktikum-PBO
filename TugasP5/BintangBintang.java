/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

/**
 *
 * @author Smsll
 */
public class BintangBintang {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("Half Triangle : ");
        System.out.println("================");
        int a = 5;
        
        for (int i = 1; i <= a; i++) {
            for(int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("================");
        System.out.println("Full Triangle : ");
        System.out.println("================");
        int n = 3;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= (2*i - 1); j++){    
                System.out.print("*");
            } 
            System.out.println();
        }
        
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}