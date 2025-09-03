package Praktikum2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daffa Danendra
 */
class KomponenMobil{
    String namaKomponen;
    
    public KomponenMobil(String namaKomponen){
        this.namaKomponen = namaKomponen;
    }
    
    public void tampilkanInfo(){
        System.out.println("Komponen: " + namaKomponen);
    }
}

class Mesin extends KomponenMobil{
    public Mesin(String namaMesin){
        super(namaMesin);
    }
    
    public void nyalakanMesin(){
        System.out.println(namaKomponen + " dinyalakan.");
    }
}

class Baterai extends KomponenMobil{
    public Baterai(String namaBaterai){
        super(namaBaterai);
    }
    
    public void cekBaterai(){
        System.out.println(namaKomponen + " diperiksa");
    }
}

class Mobil{
    private Mesin mesin;
    private Baterai baterai;
    
    public Mobil(Mesin mesin, Baterai baterai){
        this.mesin = mesin;
        this.baterai = baterai;
    }
    
    public void mulaiJalan(){
        System.out.println("Mobil mulai berjalan ...");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }
    
}

public class PercobaanAggregation3 {
    public static void main(String[] args) {
        Mesin mesin = new Mesin("Mesin V8");
        Baterai baterai = new Baterai("Baterai Lithium-ion");
        
        Mobil mobil = new Mobil(mesin, baterai);
        
        mobil.mulaiJalan();
    }
}