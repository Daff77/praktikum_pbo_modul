/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo5;

/**
 *
 * @author Daffa Danendra
 */
public class RekeningDeposito extends Rekening {
    private boolean jatuhTempo;

    public RekeningDeposito(String noRekening, double saldoAwal, boolean jatuhTempo) {
        super(noRekening, saldoAwal);
        this.jatuhTempo = jatuhTempo;
    }

    @Override
    public void tarik(double jumlah) {
        if (!jatuhTempo) {
            System.out.println("Tarik Rp" + jumlah + " | Gagal, deposito belum jatuh tempo");
        } else if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik Rp" + jumlah + " | Saldo: Rp" + saldo);
        } else {
            System.out.println("Tarik Rp" + jumlah + " | Gagal, saldo tidak cukup");
        }
    }
}

