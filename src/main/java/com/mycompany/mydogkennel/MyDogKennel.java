/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mydogkennel;

/**
 *
 * @author peter
 */
public class MyDogKennel {

    public static void main(String[] args) {

        Dog myDog1 = new Dog("Boxer", "Rover");
        Dog myDog2 = new Dog("Poodle", "Lucky");
        Dog myDog3 = new Dog("Pekingese", "Pixie");

        myDog1.bark();
        myDog1.run();
        myDog1.eat();
        myDog1.sleep();

        System.out.println("There are " + Dog.count + " dogs in the kennel");
    }
}
