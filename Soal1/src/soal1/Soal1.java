/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan bilangan 1 : ");
        int bilangan1 = input.nextInt();
        
        System.out.print("masukan bilangan 2 : ");
        int bilangan2 = input.nextInt();
        
        System.out.print("masukan bilangan 3 : ");
        int bilangan3 = input.nextInt();
        
        
        int hasiljumlah = bilangan1 + bilangan2 + bilangan3;
        System.out.println("hasil jumlah : " +hasiljumlah);
        
        int hasilkurang = bilangan1 - bilangan2 - bilangan3;
        System.out.println("hasil kurang : " +hasilkurang);
        
        int hasilkali = bilangan1 * bilangan2 * bilangan3;
        System.out.println("hasil kali : " +hasilkali);
        
        int hasilbagi = bilangan1 / bilangan2 / bilangan3;
        System.out.println("hasil bagi : " +hasilbagi);
        
    }
    
}
