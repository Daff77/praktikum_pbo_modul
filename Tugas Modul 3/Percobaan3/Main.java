/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan3;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");

        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();

        Hewan hewan;

        if (pilihan == 1) {
            hewan = new Anjing();
        } else if (pilihan == 2) {
            hewan = new Kucing();
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        hewan.suara();
        hewan.tidur();

        scanner.close();
    }
}
