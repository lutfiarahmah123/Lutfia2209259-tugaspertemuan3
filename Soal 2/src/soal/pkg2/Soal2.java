/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("input uang : ");
        int uang = input.nextInt();

        System.out.print("apakah pasangan anda ada dikelas : (ya/tidak) ");
        String tidakadakelaskuliah = input.next();

        boolean beliGacoan = (uang > 10000) && (!tidakadakelaskuliah.equalsIgnoreCase("ya"));

        if (beliGacoan) {
            System.out.println("Anda akan keluar membeli miGacoan");
        } else {
            System.out.println("Anda tidak akan keluar membeli miGacoan");
        }        
  

    }
    
}
