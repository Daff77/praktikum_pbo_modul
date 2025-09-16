/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PercobaanModul1;

/**
 *
 * @author Daffa Danendra
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, <i>name</i>.
        System.out.println("Name chosen is " + name );
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge( ) {
        System.out.println("Puppy's age is : " + puppyAge );
        return puppyAge;
    }

    public static void main(String []args) {
        Puppy myPuppy = new Puppy( "tommy" );

        myPuppy.setAge( 2 );

        myPuppy.getAge( );

        System.out.println("Variable Value = " + myPuppy.puppyAge );
    }
}


