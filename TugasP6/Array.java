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
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah element : ");
        int n = input.nextInt();
        int is = 0;
        int[] array = new int[n];
        
        do {
            System.out.print("Masukan nilai - "+ (is+1) +" : ");
            array[is] = input.nextInt();
            is++;
        }while(is < n);
        
        int terbesar = array[0];
        int iTerbesar = 0;
        int terkecil = array[0];
        int iTerkecil = 0;
        
        System.out.println("List element : ");
        for(int i =0 ; i<n; i++){
            System.out.print(array[i] + " ");
            if(array[i] > terbesar){
                terbesar = array[i];
                iTerbesar = i;
            }else if(array[i] < terkecil){
                terkecil = array[i];
                iTerkecil = i;
            }
        }
        System.out.println(" ");
        System.out.println("Terbesar : " + terbesar + " indeks ["+ iTerbesar + "]");
        System.out.println("Terkecil : " + terkecil + " indeks ["+ iTerkecil + "]");
        
        int total = 0;
        
        for(int i = 0; i<n; i++){
            total+= array[i];
        }
        
        float rataRata = total/n;
        System.out.println("Total nilai element : " + total);
        System.out.println("Rata rata nilai element : " + rataRata);
        
        int jmlhGanjil = 0;
        for(int i =1 ; i< n; i+=2){
            jmlhGanjil += array[i];
        }
        
        System.out.println("Jumlah element array ganjil : " + jmlhGanjil);
        if(jmlhGanjil % 2 == 0){
            System.out.println("Totalnya adalah bilangan : Genap");
        }else {
            System.out.print("Totalnya adalah bilangan : Ganjil");
        }
        System.out.println("");
        
        
        int[] descArray = new int[n];
        
        int temp = 0;
        
        for(int i=0; i<n -1; i++){
            for (int j=0; j<n -1 -i; j++){
                if(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            }
        }
        
        System.out.println("Urutan : ");
        System.out.println("Ascending : ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        
        
        for(int i=0; i<n-1; i++){
            for (int j=0; j<n -1 -i; j++){
                if(array[j] < array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            }
        }
        
        System.out.println("");
        System.out.println("Descending : ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        
    }
}
