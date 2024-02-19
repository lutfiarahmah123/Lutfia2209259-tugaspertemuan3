/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        char karakter4 = '4';
        char karakter6 = '6';

//        System.out.print("masukan karakter'4' : ");
//        char karakter4 = input.next().charAt(0);

//        System.out.print("masukan karakter'6' : ");
//        char karakter6 = input.next().charAt(0);
        
        int ASCII4 = (int) karakter4;
        int ASCII6 = (int) karakter6;

        int JUMLAHASCII = ASCII4 + ASCII6;
        
        
        System.out.println("Kode ASCII dari karakter '4': " + ASCII4);
        System.out.println("Kode ASCII dari karakter '6': " + ASCII6);
        System.out.println("Jumlah kode ASCII: " + JUMLAHASCII);    }
    
}
