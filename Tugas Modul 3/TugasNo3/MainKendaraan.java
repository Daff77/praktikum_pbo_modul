/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo3;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan (1 atau 2): ");

        int pilihan = scanner.nextInt();
        Kendaraan kendaraan;

        if (pilihan == 1) {
            kendaraan = new Mobil();
        } else if (pilihan == 2) {
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid");
            scanner.close();
            return;
        }

        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();

        scanner.close();
    }
}