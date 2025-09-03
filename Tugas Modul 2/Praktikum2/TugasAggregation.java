/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author Daffa Danendra
 */
class Publikasi {

    String judul;
    String penulis;

    public Publikasi(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void tampil() {
        System.out.println("Judul  : " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

class Buku extends Publikasi {

    public Buku(String judul, String penulis) {
        super(judul, penulis);
    }
}

class Perpustakaan {

    private Buku bukuA;
    private Buku bukuB;
    private Buku bukuC;

    public void isiRak1(Buku b) {
        this.bukuA = b;
    }

    public void isiRak2(Buku b) {
        this.bukuB = b;
    }

    public void isiRak3(Buku b) {
        this.bukuC = b;
    }

    public void tampilkanKoleksi() {
        System.out.println("=== Koleksi Perpustakaan ===");
        bukuA.tampil();
        System.out.println();
        bukuB.tampil();
        System.out.println();
        bukuC.tampil();
    }

}

public class TugasAggregation {

    public static void main(String[] args) {
        Buku b1 = new Buku("Algoritma dan Struktur Data", "Jamaludin");
        Buku b2 = new Buku("Pemrograman Berorientasi Objek", "Siti Aminah");
        Buku b3 = new Buku("Artificial Intelligence", "John McCarthy");

        Perpustakaan perpus = new Perpustakaan();
        perpus.isiRak1(b1);
        perpus.isiRak2(b2);
        perpus.isiRak3(b3);

        perpus.tampilkanKoleksi();
    }
}
