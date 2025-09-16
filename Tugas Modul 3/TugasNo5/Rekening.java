/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo5;

/**
 *
 * @author Daffa Danendra
 */
abstract class Rekening {
    protected String noRekening;
    protected double saldo;

    public Rekening(String noRekening, double saldoAwal) {
        this.noRekening = noRekening;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor Rp" + jumlah + " | Saldo: Rp" + saldo);
    }

    public abstract void tarik(double jumlah);

    public void infoRekening(String jenis) {
        System.out.println(jenis + " (" + noRekening + ") - Saldo Awal: Rp" + saldo);
    }
}
