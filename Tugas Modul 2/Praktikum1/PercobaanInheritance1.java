/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author Daffa Danendra
 */
public class PercobaanInheritance1 {
    static class Employee {
        float salary = 40000;
    }

    static class Programmer extends Employee {
        int bonus = 10000;
        public static void main(String[] args) {
            Programmer p = new Programmer();
            System.out.println("Programmer salary is: " + p.salary);
            System.out.println("Bonus of Programmer is: " + p.bonus);
        }
    }
}
