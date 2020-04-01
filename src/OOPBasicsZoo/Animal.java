package OOPBasicsZoo;

import java.lang.reflect.Constructor;

public abstract class Animal {
// A class is a specification / A blueprint / A design.

    // Attributes for the Animal Object
    int age;
    String gender;
    int weightInLbs;

    // Constructor for how the animal object should be created
    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }


    //Two behaviors that all animals should have
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
    // With an abstract modifier added to a class, any class that extends this class will need the move method implemented. We're not implementing this in the class, we're just creating an abstraction for the idea of moving. And this class doesn't tell a particular animal how to move. A fish can swim and a bird can fly. Or a chicken can walk. These are different types of movements based on how the animal moves.

    // You cannot create instances of an Abstract class, abstract classes are used for inheritance. This is usually a parent class and expects child classes to implement the abstract methods.

}








