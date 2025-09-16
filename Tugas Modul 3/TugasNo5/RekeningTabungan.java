/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo5;

/**
 *
 * @author Daffa Danendra
 */

public class RekeningTabungan extends Rekening {
    public RekeningTabungan(String noRekening, double saldoAwal) {
        super(noRekening, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik Rp" + jumlah + " | Saldo: Rp" + saldo);
        } else {
            System.out.println("Tarik Rp" + jumlah + " | Gagal, saldo tidak cukup");
        }
    }
}
