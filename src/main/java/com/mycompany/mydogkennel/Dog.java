package com.mycompany.mydogkennel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author peter
 */
public class Dog {

    int health;
    String breed;
    String name;
    static int count = 0;

    public Dog(String theBreed, String theName) {
        breed = theBreed;
        name = theName;
        switch (breed) {
            case "Boxer":
                health = (int) (Math.random() * (7 - 4) + 4);
                break;
            case "Poodle":
                health = (int) (Math.random() * (8 - 2 + 1) + 2);
                break;
            case "Pekingese":
                health = (int) (Math.random() * (5 - 1 + 1) + 1);
                break;
        }
        count++;
    }

    public void changeHealth(int change) {
        health += change;
        System.out.println(name + "'s health is now " + health);
        if (health == 0) {
            System.out.println(name + " has died");
            count--;
        } else if (health == 10) {
            System.out.println(name + " has become a Superdog and flown away from the kennel");
            count--;
        }
    }

    public void bark() {
        System.out.println(name + " says Woof Woof!");
        changeHealth(-1);
    }

    public void run() {
        System.out.println(name + " goes for a run");
        changeHealth(-1);
    }

    public void eat() {
        System.out.println(name + " eats food");
        changeHealth(1);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
        changeHealth(1);
    }
}
