/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author Daffa Danendra
 */
class Rekening {
    // atribut dienkapsulasi (private)
    private String nomorRekening;
    private double saldo;
    private String pin;

    // constructor
    public Rekening(String nomorRekening, double saldoAwal, String pin) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
        this.pin = pin;
    }

    // getter dan setter untuk nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // getter dan setter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // getter dan setter untuk PIN
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

public class TugasEnkapsulasi {
    public static void main(String[] args) {
        Rekening rek = new Rekening("123456", 1000000, "1234");

        System.out.println("Nomor Rekening: " + rek.getNomorRekening());
        System.out.println("Saldo awal    : Rp " + rek.getSaldo());

        rek.setSaldo(1500000);
        System.out.println("Saldo setelah diset: Rp " + rek.getSaldo());

        rek.setPin("4321");
        System.out.println("PIN berhasil diubah (tidak bisa ditampilkan");
    }
}
