/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo6;

/**
 *
 * @author Daffa Danendra
 */
public class Majalah extends Item {
    public Majalah(String judul, int tahun) { super(judul, tahun); }
    @Override public void tampilkanInfo() { System.out.println(judul + " (" + tahun + ") - Majalah"); }
}
