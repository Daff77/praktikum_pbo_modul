/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasNo4;

/**
 *
 * @author Daffa Danendra
 */
public class Radio implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Radio dihidupkan");
    }

    @Override
    public void matikan() {
        System.out.println("Radio dimatikan");
    }
}