/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan28;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        try (Scanner input = new Scanner(System.in)) {
           System.out.println("=====Program mengganti kata=====");
           
           System.out.print("Masukkan Kalimat: ");
           String kalimatAwal = input.nextLine();
           
           System.out.print("Ganti kata: ");
           String kataGanti = input.nextLine();
           
           System.out.print("Menjadi kata: ");
           String kataBaru = input.nextLine();
           
           String kalimatBaru = kalimatAwal.replaceAll(kataGanti, kataBaru);
           
           System.out.println("\n===Hasil Formating===");
           System.out.println("Kalimat awal = " + kalimatAwal);
           System.out.println("Kalimat baru = " + kalimatBaru);
       }
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }}

