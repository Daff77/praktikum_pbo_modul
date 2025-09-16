/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo6;

/**
 *
 * @author Daffa Danendra
 */
import java.util.Scanner;

import java.util.ArrayList;

public class MainPerpus {
    public static void main(String[] args) {
        ArrayList<Item> koleksiTambah = new ArrayList<>();
koleksiTambah.add(new Buku("Belajar Java", 2023));
koleksiTambah.add(new Majalah("Tekno Magazine", 2022));
koleksiTambah.add(new DVD("Film Inspiratif", 2021));
        for (Item it : koleksiTambah) it.tampilkanInfo();
    }
}   