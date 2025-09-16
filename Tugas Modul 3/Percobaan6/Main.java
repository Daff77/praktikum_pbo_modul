/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan6;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Pilih jenis kendaraanl: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
    
        System.out.println("Masukkan pilihan anda (1 atau 2): ");
        int pilihan = scan.nextInt();
        
        Kendaraan kendaraan;
        
        if (pilihan == 1) {
            kendaraan = new Mobil();
        } else if (pilihan == 2){
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        System.out.println("Pilih aksi:");
        System.out.println("1. Nyalakan mesin");
        System.out.println("2. Matikan mesin");
        
        System.out.println("Masukkan pilihan aksi anda (1 atau 2): ");
        int aksi = scan.nextInt();
        
        if (aksi == 1) {
            kendaraan.startEngine();
        } else if (aksi == 2) {
            kendaraan.stopEngine();
        } else {
            System.out.println("Aksi tidak valid.");
        }
        
        scan.close();
    }   
}
