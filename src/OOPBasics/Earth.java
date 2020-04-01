package OOPBasics;

public class Earth {
    public static void main(String[] args) {

        // First we need a variable of type human.
        // Human tom;

        // Right now it's just a variable, we need to assign it a value. So we'll assign Tom the object.

        // The new keyword is used when calling the constructor method to create a new object.
        // tom = new Human();

        // This can also be done shorthand:

         Human tom = new Human();

        // Tom is a variable of type human, and we call the human's class constructor.
        // Keep in mind tom is just a variable, in reality this is not an object.
        // Objects come into existence when the application starts up, right now we are just creating a structure a way to organize our code so when our application runs line by line that's when everything will happen and the object will be created when the program is running.

        // Lets make tom speak
//        tom.speak();

        // We print the following:
        // Hello, my name is null.
        // I am 0 inches tall.
        // I am 0 years old.
        // My eye color is null.

        // We get this because we haven't assigned any of the properties for tom.

        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";

        // Now lets make tom speak again
        tom.speak();

        //Now we print the following:
        // Hello, my name is Tom Zsabo.
        // I am 72 inches tall.
        // I am 5 years old.
        // My eye color is brown

        //TODO: Create an object called Joe and give him some values and call the speak method on that object.
        Human joe = new Human();

        joe.age = 35;
        joe.heightInInches = 80;
        joe.name = "Joe Sanchez";
        joe.eyeColor = "Brown";

        joe.speak();

        // This prints the following:
        // Hello, my name is Joe Sanchez.
        // I am 80 inches tall.
        // I am 35 years old.
        // My eye color is brown.

    }
}
