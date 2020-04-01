package OOPBasics;

public class Human {
// Classes contain instructions for how objects can be created as well as how the objects carry out certain behavior.

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // Constructor methods always have the same exact name as your class. And your constructor can be empty.
    public Human() {

    }


    // The methods defined here are the instructions for how humans will behave. But we need a way to be able to create the actual human objects from this specification. So we have to build a constructor. It provides a way to construct objects, and since this is a human class it wil help us create objects of type human.
    public void speak() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }





}
