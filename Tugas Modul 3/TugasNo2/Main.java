/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo2;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hewan[] hewanArray = new Hewan[4];
        hewanArray[0] = new Anjing();
        hewanArray[1] = new Kucing();
        hewanArray[2] = new Burung();
        hewanArray[3] = new Kucing();

        System.out.println("Pilih hewan dari 0 hingga 3:");
        System.out.println("0: Anjing");
        System.out.println("1: Kucing");
        System.out.println("2: Burung");
        System.out.println("3: Kucing");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();

        if (pilihan >= 0 && pilihan < hewanArray.length) {
            hewanArray[pilihan].suara();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
