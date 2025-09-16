/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;
import java.util.Scanner;
/**
 *
 * @author Daffa Danendra
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Anjing();
        hewanArray[1] = new Kucing();
        hewanArray[2] = new Kucing();

        System.out.println("Pilih hewan dari 0 hingga 2:");

        int pilihan = scanner.nextInt();

        if (pilihan >= 0 && pilihan < hewanArray.length) {
            hewanArray[pilihan].suara();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}