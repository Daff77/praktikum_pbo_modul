/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo4;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

public class MainElektronik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek
        AlatElektronik televisi = new Televisi();
        AlatElektronik radio = new Radio();

        System.out.println("Pilih alat elektronik:");
        System.out.println("1. Televisi");
        System.out.println("2. Radio");
        System.out.print("Masukkan pilihan (1 atau 2): ");

        int pilihanAlat = scanner.nextInt();

        System.out.println("Pilih aksi:");
        System.out.println("1. Hidupkan");
        System.out.println("2. Matikan");
        System.out.print("Masukkan pilihan aksi (1 atau 2): ");

        int pilihanAksi = scanner.nextInt();

        AlatElektronik alat;
        if (pilihanAlat == 1) {
            alat = televisi;
        } else if (pilihanAlat == 2) {
            alat = radio;
        } else {
            System.out.println("Pilihan alat tidak valid");
            scanner.close();
            return;
        }

        if (pilihanAksi == 1) {
            alat.hidupkan();
        } else if (pilihanAksi == 2) {
            alat.matikan();
        } else {
            System.out.println("Pilihan aksi tidak valid");
        }

        scanner.close();
    }
}