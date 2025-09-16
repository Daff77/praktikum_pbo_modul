/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo5;

/**
 *
 * @author Daffa Danendra
 */
public class MainBank {
    public static void main(String[] args) {
        Rekening tabungan = new RekeningTabungan("001", 1000000);
        Rekening giro = new RekeningGiro("002", 200000);
        Rekening depositoBelum = new RekeningDeposito("003", 5000000, false);
        Rekening depositoSudah = new RekeningDeposito("004", 7000000, true);

        System.out.println("=== Simulasi Rekening Bank ===");

        tabungan.infoRekening("Tabungan");
        tabungan.setor(500000);
        tabungan.tarik(300000);
        System.out.println();

        giro.infoRekening("Giro");
        giro.tarik(600000);
        giro.tarik(1000000);
        System.out.println();

        depositoBelum.infoRekening("Deposito (Belum Jatuh Tempo)");
        depositoBelum.tarik(1000000);
        System.out.println();

        depositoSudah.infoRekening("Deposito (Sudah Jatuh Tempo)");
        depositoSudah.tarik(2000000);

        System.out.println("=== Selesai ===");
    }
}
