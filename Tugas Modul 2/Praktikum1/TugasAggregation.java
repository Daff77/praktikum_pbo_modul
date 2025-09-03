/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author Daffa Danendra
 */
// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound");
    }
}

// Hierarchical inheritance
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void sound() {  
        System.out.println(name + " guk guk");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void sound() { 
        System.out.println(name + " miawww");
    }
}

// Main program
public class TugasAggregation {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        a.sound();

        Dog d = new Dog("Doggy");
        d.sound();  

        Cat c = new Cat("Kitty");
        c.sound();   
    }
}
